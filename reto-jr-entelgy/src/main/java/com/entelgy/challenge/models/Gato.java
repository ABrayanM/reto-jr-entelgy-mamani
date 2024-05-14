package com.entelgy.challenge.models;

public class Gato extends Animal {
    public Gato(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Gato");
    }

    @Override
    public String realizarSonido() {
        return "Maullar";
    }

}

