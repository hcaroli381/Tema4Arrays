package ejercicios4_2ArraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio1 {
	public void show() {
		int[][] lista1 = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
		System.out.printf("¿El array %s es simétrico?\n%b", Arrays.deepToString(lista1), simetria(lista1));
	}

	public boolean simetria(int[][] array1) {
		int suma = 0;// contador para saber si es simetrico o no
		int[][] lista1 = array1;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (lista1[i][j] != lista1[j][i]) {
					suma = suma + 1;
				}
			}
		}
		if (suma != 0) { // si ha sumado es que algún valor no es simétrico
			return false;
		} else {
			return true;
		}

	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
