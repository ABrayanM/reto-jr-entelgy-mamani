package com.entelgy.challenge.models;

public class Vaca extends Animal {
    public Vaca(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Vaca");
    }

    @Override
    public String realizarSonido() {
        return "Mugir";
    }
}
