package com.entelgy.challenge.services;

import com.entelgy.challenge.models.Animal;

public class AnimalService {
    public String describirAnimalPorNombre(Animal[] animales, String nombre) {
        for (Animal animal : animales) {
            if (animal.getNombre().equals(nombre)) {
                return animal.describir();
            }
        }
        throw new RuntimeException("Animal no encontrado");
    }
}
