package com.pruebajava.pruebajavapoo.models;

import java.util.ArrayList;

public class Alumno {

    public String nombre;
    public Double nota;
    public ArrayList<Double> notas;
    
    
    public Alumno() {
    }


    public Alumno(String nombre, Double nota, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Double getNota() {
        return nota;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    public void getNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public void promedioAlumno(){
        Double promedio = 0.0;

        for (int i = 0;i < this.notas.size();i++ ){
            promedio += this.notas.get(i);

        }
    }

    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", nota=" + nota + "]";
    }
    
    


}
