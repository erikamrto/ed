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
		int numero;
		do {
			System.out.print("Introduce el número: ");
			String line = scanner.nextLine();
			numero = Integer.parseInt(line);
			//damos pista al usuario
			
			if (numero < numeroAleatorio) {
				System.out.println("El numero escondido es mayor.");
			}
			else if(numero > numeroAleatorio){
				System.out.println("El numero escondido es menor.");
			}
				
		} while (numero != numeroAleatorio);
		System.out.println("Muy bien. Has acertado");
	
	}

}
