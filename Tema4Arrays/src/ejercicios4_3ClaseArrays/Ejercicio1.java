package ejercicios4_3ClaseArrays;

import java.util.Arrays;

public class Ejercicio1 {
	int matriz[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 } };

	public void show() {
		int matrizShow[][] = doblarColumnas(matriz);
		System.out.printf("%s", Arrays.deepToString(matrizShow));
	}

	public int[][] doblarColumnas(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			matriz[i] = Arrays.copyOf(matriz[i], matriz[i].length * 2);
		}

		return matriz;
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
