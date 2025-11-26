package ejercicios4_2ArraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio3 {

	public void exercise3(int[][] matrizCuadrada) {
		boolean igualdad;
		String fila;

		int n = matrizCuadrada.length;

		if (n != matrizCuadrada[0].length) {
			System.out.println("La matriz no es cuadrada");
		}

		for (int i = 0; i < matrizCuadrada.length; i++) {
			igualdad = true;
			fila = "";
			for (int j = 0; j < matrizCuadrada[i].length; j++) {
				if (matrizCuadrada[i][j] != matrizCuadrada[j][i]) {
					igualdad = false;
				}

			}
			if (igualdad) {
				System.out.printf("Fila %d : %s es igual que la columna %d\n", i, Arrays.toString(matrizCuadrada[i]),
						i);
			}
		}

	}

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
		new Ejercicio3().exercise3(matriz);
	}

}
