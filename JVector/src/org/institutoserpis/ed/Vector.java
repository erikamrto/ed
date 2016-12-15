package org.institutoserpis.ed;

//import java.util.Random;

public class Vector {

	public static void main(String[] args) {

		int index = indexOf(new int[] { 32, 15, 7, 9, 12 }, 99);
		System.out.println("Vector index=" + index);

		// int index= 0;
		// while (index <5) {
		// System.out.println("index=" + index);
		// index++;
		// }
		// System.out.println("fuera del ciclo index=" + index);
		//
		// int[] v = new int[]{32, 15, 7, 9, 12};
		// for (int index = 0; index < v.length; index++ ){
		// System.out.println(v[index]);
		// }
		//
		// System.out.println("indexOf=" + indexOf(v, 32));
	}

	public static int indexOf(int[] v, int data) {
		//	Wirth Algoritmos y Estructuras de datos
		int index = 0;
		while (index < v.length && v[index] != data)
			index++;
		if (index == v.length)
			return -1;
		return index;
	}
}
