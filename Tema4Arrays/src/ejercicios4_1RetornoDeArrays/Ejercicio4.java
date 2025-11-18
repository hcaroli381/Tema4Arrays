package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio4 {
	public void show() {
		int[] lista = { 1, 2, 3, 4, 5 };
		System.out.printf("%s", Arrays.toString(listaReversa(lista)));
	}

	public int[] listaReversa(int[] lista) {
		int[] arrayReverso = Arrays.copyOf(lista, lista.length);
		int[] arrayRecorte = new int[lista.length];
		if (arrayRecorte.length == 0) {
			return arrayReverso;
		} else {
			arrayReverso[0] = arrayReverso[arrayReverso.length - 1];
			arrayRecorte = Arrays.copyOfRange(arrayReverso, 0, arrayReverso.length - 1);

		}
		return listaReversa(arrayRecorte);
	}

	public static void main(String[] args) {
		new Ejercicio4().show();
	}

}
