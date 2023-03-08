package com.cursoceat.main;

public class Persona {

	protected String nombre;//protected para que lo pueda ver la subclase
	protected byte edad;
	protected double estatura;
	
public Persona(String nombre, byte edad, double estatura) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
	}

public Persona() {
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public byte getEdad() {
	return edad;
}

public void setEdad(byte edad) {
	this.edad = edad;
}

public double getEstatura() {
	return estatura;
}

public void setEstatura(double estatura) {
	this.estatura = estatura;
}
	
void mostrarDatos() {//this es en la misma clase 
	System.out.println("Nombre: " + this.nombre);
	System.out.println("Edad: "   + this.edad);
	System.out.println("Estatura: " + this.estatura);
}
	
}
