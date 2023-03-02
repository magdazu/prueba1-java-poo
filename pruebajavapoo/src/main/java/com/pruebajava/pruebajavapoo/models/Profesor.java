package com.pruebajava.pruebajavapoo.models;

import java.util.ArrayList;
import java.util.Scanner;

public class Profesor {
    public Double notasAlumno;

    public Profesor() {
    }

    public Profesor(Double notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    public Double getNotasAlumno() {
        return notasAlumno;
    }

    public void setNotasAlumno(Double notasAlumno) {
        this.notasAlumno = notasAlumno;
    }

    public void ingresaNotas(){
       System.out.println("hols");
        
        
    }

    @Override
    public String toString() {
        return "Profesor [notasAlumno=" + notasAlumno + "]";
    }

    

}
