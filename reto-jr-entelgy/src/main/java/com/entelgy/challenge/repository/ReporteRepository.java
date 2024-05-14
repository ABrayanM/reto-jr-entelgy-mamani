package com.entelgy.challenge.repository;

import com.entelgy.challenge.models.Animal;
import com.entelgy.challenge.models.Gato;
import com.entelgy.challenge.models.Perro;
import com.entelgy.challenge.models.Vaca;

public class ReporteRepository {
    public Animal[] cargarDatos() {
        Animal[] animales = new Animal[9];

        // Crear 3 objetos de cada animal
        animales[0] = new Perro("Perro1", 3, "Labrador", 10);
        animales[1] = new Perro("Perro2", 5, "Pastor Alemán", 12);
        animales[2] = new Perro("Perro3", 2, "Chihuahua", 15);

        animales[3] = new Gato("Gato1", 4, "Siames", 14);
        animales[4] = new Gato("Gato2", 6, "Persa", 16);
        animales[5] = new Gato("Gato3", 2, "Maine Coon", 12);

        animales[6] = new Vaca("Vaca1", 7, "Holstein", 20);
        animales[7] = new Vaca("Vaca2", 9, "Angus", 18);
        animales[8] = new Vaca("Vaca3", 6, "Hereford", 22);

        return animales;
    }
}
