package ejercicios4_1RetornoDeArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
	Scanner keyboard = new Scanner(System.in);

	public void show() {
		int[] arrayMain = pedirArray();
		System.out.printf("Tu array es : %s\n", Arrays.toString(arrayMain));
		System.out.printf("El array reverso es : %s", Arrays.toString(reverso(arrayMain)));
	}

	public int[] pedirArray() {// pedir longitud y valores
		int longitud = 0;
		int valorPosicion = 0;
		do {
			System.out.println("Introduce la longitud del array, máximo 5 :");
			longitud = keyboard.nextInt();

			if ((longitud < 0 || longitud > 5)) {
				System.out.println("Valor fuera de rango!!!");
			}
		} while (longitud < 0 || longitud > 5);

		int[] array1 = new int[longitud];

		for (int i = 0; i < array1.length; i++) {
			System.out.printf("Introduce el valor de la posicion %d del array :\n", i + 1);
			valorPosicion = keyboard.nextInt();
			array1[i] = valorPosicion;
		}
		return array1;

	}

	public int[] reverso(int[] array1) {
		int[] array1Reverso = new int[array1.length];

		for (int i = 0; i < array1.length; i++) {
			array1Reverso[i] = array1[array1.length - 1 - i];
		}
		return array1Reverso;
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
