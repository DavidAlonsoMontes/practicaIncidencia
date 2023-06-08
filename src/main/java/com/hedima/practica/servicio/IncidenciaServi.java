package com.hedima.practica.servicio;

import com.hedima.practica.modelo.Incidencia;
import com.hedima.practica.repositorio.IIncidenciaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidenciaServi implements IIncidenciaServi{

    @Autowired
    private IIncidenciaRepo repo;

    @Override
    public Incidencia alta(Incidencia incidencia) {
        return repo.save(incidencia);
    }

    @Override
    public void baja(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Incidencia cambio(Incidencia incidencia) {
        return repo.save(incidencia);
    }

    @Override
    public Incidencia consultaUno(Integer id) {
        return repo.findById(id).orElse(new Incidencia());
    }

    @Override
    public List<Incidencia> consultaTodos() {

        List<Incidencia> lista=repo.findAll();
        return lista;
    }
}
