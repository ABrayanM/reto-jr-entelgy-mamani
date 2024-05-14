package com.entelgy.challenge;

import com.entelgy.challenge.models.Animal;
import com.entelgy.challenge.repository.ReporteRepository;
import com.entelgy.challenge.services.AnimalService;

public class Reporte {
    public static void main(String[] args) {
        Reporte reporte = new Reporte();
        Animal[] animales = reporte.cargarDatos();

        AnimalService animalService = new AnimalService();
        String nombreAnimalBuscado = "Vaca1";

        try {
            String descripcion = animalService.describirAnimalPorNombre(animales, nombreAnimalBuscado);
            System.out.println(descripcion);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public Animal[] cargarDatos() {
        ReporteRepository repository = new ReporteRepository();
        return repository.cargarDatos();
    }
}
