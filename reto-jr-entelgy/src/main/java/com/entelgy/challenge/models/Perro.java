package com.entelgy.challenge.models;

public class Perro extends Animal {
    public Perro(String nombre, int edad, String raza, int tiempoDeVida) {
        super(nombre, edad, raza, tiempoDeVida, "Perro");
    }

    @Override
    public String realizarSonido() {
        return "Ladrar";
    }
}