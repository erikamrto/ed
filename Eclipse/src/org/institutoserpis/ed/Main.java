package org.institutoserpis.ed;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		int Aleatorio = random.nextInt(5000) + 4;
		//primer apartado
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce tu nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Introduce tus apellidos: ");
		String apellidos = scanner.nextLine();
		System.out.print("Y por último dinos tu edad: ");
		String edad = scanner.nextLine();
		System.out.println("Hola " + nombre + " " + apellidos + " con tu edad de " + edad + " años, acontinuación haremos un par de ejercicios de prueba: ");
		//segundo apartado
		System.out.println();
		System.out.println("EJERCICIO 1");
		System.out.println();
		System.out.println("Tengo un numero de 1 a 5000. Debes adivinarlo...");
		System.out.println("El numero aleatorio es = " + Aleatorio);
		boolean acertado;
		int contadorIntentos = 0;
		do{	
			contadorIntentos++;
			System.out.printf("Introduce el número (intento nº %d): ", contadorIntentos);
			String line = scanner.nextLine();
			int numero = Integer.parseInt(line);
			if (numero < Aleatorio) {
				System.out.println("El numero que buscas es mayor.");
			}
			if(numero > Aleatorio){
				System.out.println("El numero que buscas es menor.");
			}
			acertado = numero == Aleatorio;
		} 
		while (!acertado);
		System.out.printf("Muy bien, has acertado (al intento nº %d).\n", contadorIntentos);
		//tercer apartado
		System.out.println();
		System.out.println("EJERCICIO 2");
		System.out.println();
		System.out.println("Ahora que hemos acabado con el primero haremos, el segundo ejercicio ");
		 int tiempo;
	        int segundos;
	        int minutos;
	        int horas;
	        int dias;

	        System.out.print("Solo tienes que introducir un numero de tiempo en segundos: ");
	        tiempo = scanner.nextInt();

	        segundos = tiempo % 60;
	        minutos = tiempo/60 % 60;
	        horas = tiempo/(60*60) % 24;
	        dias = tiempo/(60*60*24);

	        System.out.println(dias + "d " + horas + "h " + minutos + "min " +
	        		segundos + "s. Asi de facil era este ejemplo." );
	scanner.close();	
	}
}
