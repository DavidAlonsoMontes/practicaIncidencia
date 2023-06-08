package com.hedima.practica.servicio;

import com.hedima.practica.modelo.Incidencia;

import java.util.List;

public interface IIncidenciaServi {

    public Incidencia alta(Incidencia incidencia);
    public void baja(Integer id);
    public Incidencia cambio(Incidencia incidencia);
    public Incidencia consultaUno(Integer id);
    public List<Incidencia> consultaTodos();

}
