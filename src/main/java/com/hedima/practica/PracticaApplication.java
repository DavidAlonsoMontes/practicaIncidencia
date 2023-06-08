package com.hedima.practica;

import com.hedima.practica.modelo.Incidencia;
import com.hedima.practica.servicio.IIncidenciaServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class PracticaApplication /* implements CommandLineRunner*/ {

    @Autowired
    IIncidenciaServi incidencia;
    public static void main(String[] args) {
        SpringApplication.run(PracticaApplication.class, args);
    }
/*
    @Override
    public void run(String... args) throws Exception {

        Incidencia i1=new Incidencia(1, LocalDate.of(2023, 4, 1),"David",5);
        Incidencia i2=new Incidencia(2, LocalDate.of(2023, 5, 2),"Gregana",8);
        Incidencia i3=new Incidencia(3, LocalDate.of(2023, 6, 3),"Sandra",3);

        incidencia.alta(i1);
        incidencia.alta(i2);
        incidencia.alta(i3);
    }*/
}
