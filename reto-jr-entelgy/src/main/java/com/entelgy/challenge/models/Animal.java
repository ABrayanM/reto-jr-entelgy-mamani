package com.entelgy.challenge.models;

public abstract class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private int tiempoDeVida;
    private String tipo;

    public Animal(String nombre, int edad, String raza, int tiempoDeVida, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tiempoDeVida = tiempoDeVida;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getTiempoDeVida() {
        return tiempoDeVida;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract String realizarSonido();

    public String describir() {
        return nombre + " es un " + tipo + " de raza " + raza + " que tiene " + edad + " de edad. Siempre " + realizarSonido() + " cuando está feliz. Su expectativa de vida es de " + tiempoDeVida + " años.";
    }
}
