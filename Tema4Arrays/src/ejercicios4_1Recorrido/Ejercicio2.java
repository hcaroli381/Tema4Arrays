package ejercicios4_1Recorrido;

import java.util.Scanner;

public class Ejercicio2 {
	Scanner keyboard = new Scanner(System.in);

	public void exercise2() {
		int numeros[] = { 23, 42, 34, 56, 89, 12, 0, 1, 2, 11, 23 };

		System.out.println(
				"Escribe true para mostrar las posiciones pares o false para mostrar las posiciones impares del array :");
		boolean eleccion = keyboard.nextBoolean();

		for (int i = 0; i < numeros.length; i++) {
			if (eleccion == true && (i % 2 == 0)) {
				System.out.printf("Posición %d -> %d\n", i, numeros[i]);
			} else if (eleccion == false && (i % 2 != 0)) {
				System.out.printf("Posición %d -> %d\n", i, numeros[i]);
			}
		}

	}

	public static void main(String[] args) {
		new Ejercicio2().exercise2();
	}

}
