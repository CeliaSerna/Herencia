package com.cursoceat.main;

import java.util.Scanner;

public class Main {

static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
		// TODO Auto-generated method stub

Empleado yoEmpleado = new Empleado("CeliaS",(byte)33, 1.60,9);
yoEmpleado.mostrarDatos();//metodo de la clase hija
Persona yoPersona= new Persona("Celia",(byte)32,1.61);	
yoPersona.mostrarDatos();	//metodo de la clase padre
	
}
}
