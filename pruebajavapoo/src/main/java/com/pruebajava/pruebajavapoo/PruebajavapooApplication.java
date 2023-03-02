package com.pruebajava.pruebajavapoo;


import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pruebajava.pruebajavapoo.models.Alumno;
import com.pruebajava.pruebajavapoo.models.Profesor;

import java.util.ArrayList;

@SpringBootApplication
public class PruebajavapooApplication {
    /*Se debe  crear una funcion que permita al profesor ingresar notas por estudiante y que luego permita 
     * obtener el promedio de cada estudiante 
    */
    //se crear un scanner para que permita ingresar datos al usuario,
    //se solicita ingresar la cantidad de alumno
    //crear variablre para almacenar el numero de alumnos
    //se crear una lista para almacenar las notas de los alumnos con el objeto creado Alumno
    //dentro del objeto se crear un metodo para calcular el promedio de notas por alumno
    //se crea un bucle for que te permita ingresar segun la cantidad de alumnos, la nota por alumno  
    //se deberia utilizar metodo creado en objeto para ingresar el promedio de notas por alumno
    
	
	public static void ingresoNotas(){
		Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int numAlumnos = input.nextInt();
        ArrayList <Double> notasAlumnos = new ArrayList<Double>();
        double suma = 0;
        for (int i = 0; i < numAlumnos; i++) {
            System.out.print("Ingrese la nota del alumno " + (i+1) + ": ");
            Double notasAl = input.nextDouble();
            suma += notasAl;
            notasAlumnos.add(notasAl);
         
        }
        double promedio = suma / numAlumnos;
        System.out.println("El promedio de notas de los " + numAlumnos + " alumnos es: " + promedio);
        input.close();
		
    }

    /*Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
 */
    // lista que permita definir y mostrar la cantiada de alumnos por curso
    //se crea peticion para agregar nombres 
    public static int alumnoCurso(){
	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese cantidad de alumno");
		int cantAlumno = input.nextInt();
		ArrayList <String> alumnos = new ArrayList<String>();
		
		for (int i = 0; i < cantAlumno; i++){
			input.nextLine();// se usa para evitar que aparezcan dos peticiones de ingreso de datos juntas 
            System.out.println("Ingrese el nombre del alumno: ");
			String nomAlumno = input.nextLine();
			alumnos.add(nomAlumno);// se agregan los datos a la lista
		}

        input.close();
		return cantAlumno;
	}



	public static void main(String[] args) {

		ingresoNotas();

        alumnoCurso();


	}

}

