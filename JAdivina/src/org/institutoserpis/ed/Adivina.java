package org.institutoserpis.ed;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class Adivina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("Tengo un numero entre 1 y 1000. Adivina...");
		System.out.println("numeroAleatorio=" + numeroAleatorio);
		Scanner scanner = new Scanner(System.in);
		boolean acertado;
		int contadorIntentos = 0;
		do {
			contadorIntentos++;
			System.out.printf("Introduce el número (intento nº %d): ", contadorIntentos);
			String line = scanner.nextLine();
			int numero = Integer.parseInt(line);
			//damos pista al usuario
			if (numero < numeroAleatorio) {
				System.out.println("El numero escondido es mayor.");
			}
			if(numero > numeroAleatorio){
				System.out.println("El numero escondido es menor.");
			}
			acertado = numero == numeroAleatorio;
				
		} while (!acertado);
		System.out.printf("Muy bien. Has acertado (al intento nº %d).\n", contadorIntentos);
	
	}

}
