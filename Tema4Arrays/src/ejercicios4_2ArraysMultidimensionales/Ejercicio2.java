package ejercicios4_2ArraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio2 {
	public void show() {
		double[][][] list1 = {
				{ { 1111.11, 1.23, 1.99, 2.34 }, { 3.33, 4.44, 5.55, 101.11 }, { 23232323.23, 6.66, 7.77 } } };
		System.out.printf("El número más grande del array %s es :\n%.2f", Arrays.deepToString(list1), higher(list1));
	}

	public double higher(double[][][] list1) {
		double theHighest = 0;
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[i].length; j++) {
				for (int k = 0; k < list1[i][j].length; k++) {
					if (list1[i][j][k] >= theHighest) {
						theHighest = list1[i][j][k];
					}
				}
			}
		}
		return theHighest;
	}

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

}
