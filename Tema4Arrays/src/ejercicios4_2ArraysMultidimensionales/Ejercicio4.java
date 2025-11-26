package ejercicios4_2ArraysMultidimensionales;

import java.util.Arrays;

public class Ejercicio4 {
	public void exercise4(int[][] matrizCuadrada) {
		int valor;
		int[] sumaFilas = new int[matrizCuadrada.length];
		int[] sumaColumnas = new int[matrizCuadrada.length];

		for (int i = 0; i < matrizCuadrada.length; i++) {
			for (int j = 0; j < matrizCuadrada[i].length; j++) {
				valor = matrizCuadrada[i][j];

				sumaFilas[i] += valor;

				sumaColumnas[j] += valor;

			}
		}
		System.out.printf("Para el array %s\n", Arrays.deepToString(matrizCuadrada));
		System.out.printf("Suma filas : %d\n", sumaFilas[sumaFilas.length - 1]);
		System.out.printf("Suma columnas : %s", sumaColumnas[sumaColumnas.length - 1]);
	}

	public static void main(String[] args) {
		int[][] matriz = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
		new Ejercicio4().exercise4(matriz);
	}

}
