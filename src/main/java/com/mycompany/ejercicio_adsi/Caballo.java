/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio_adsi;

/**
 *
 * @author Acer
 */
public class Caballo {

    private String nombre;
    private int edad;
    private double tamaño;
    private double peso;
     //stive 

    public Caballo(String nombre, int edad, double tamaño, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamaño = tamaño;
        this.peso = peso;
    }

    public Caballo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public void correr(){
        System.out.println("El caballo acaba de salir a correr");
    
}
    public void levataPatas(){
        System.out.println("El caballo levanta patas");
    }
    public void levantaCabeza(){
        System.out.println("El caballo levanta cabeza");
    }
  
    
}

