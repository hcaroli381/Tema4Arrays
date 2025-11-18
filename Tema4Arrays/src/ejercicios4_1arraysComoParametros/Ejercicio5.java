package ejercicios4_1arraysComoParametros;

import java.util.Scanner;

public class Ejercicio5 {
	Scanner keyboard = new Scanner(System.in);

	public void show() {
		int[] array1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int ast = 0;

		for (int i = 0; i < array1.length; i++) {

			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		new Ejercicio5().show();
	}

}
