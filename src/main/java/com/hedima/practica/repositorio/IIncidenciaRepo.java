package com.hedima.practica.repositorio;

import com.hedima.practica.modelo.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IIncidenciaRepo extends JpaRepository<Incidencia, Integer> {
}
