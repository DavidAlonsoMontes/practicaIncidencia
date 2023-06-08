package com.hedima.practica.controlador;

import com.hedima.practica.modelo.Incidencia;
import com.hedima.practica.servicio.IIncidenciaServi;
import com.hedima.practica.servicio.IncidenciaServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/incidencias")
public class ControladorIncidencia {

    @Autowired
    IIncidenciaServi servi;
    @GetMapping("/listar")
    public String listar(Model m){
        List<Incidencia> incidencias=servi.consultaTodos();
        m.addAttribute("listaincidencias", incidencias);
        return "listar";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarIncidencia(@PathVariable("id") Integer id, Model m){
        servi.baja(id);
        return "redirect:/";
    }

    @GetMapping("/modificar/{id}")
    public String modificarIncidencia(@PathVariable("id") Integer id, Model m){
        Incidencia incidencia = servi.consultaUno(id);
        m.addAttribute("incidencia",incidencia);
        return "formulario";
    }

    @PostMapping ("/modificar/guardar")
    public String guardarIncidencia(@ModelAttribute("incidencia") Incidencia incidencia){
        servi.cambio(incidencia);
        return "redirect:/";
    }
    @GetMapping ("/insertar")
    public String insertarIncidencia(){

        return "formularioinsertar";
    }

    @PostMapping ("/insertar/alta")
    public String altaIncidencia(@ModelAttribute("incidencia") Incidencia incidencia){
        servi.alta(incidencia);
        return "redirect:/";
    }
}
