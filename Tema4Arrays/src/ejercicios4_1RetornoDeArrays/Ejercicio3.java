package ejercicios4_1RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio3 {
	public void show() {
		int[] lista = { 5, 10, 3, 23, 8, 4, 2, 1 };
		System.out.printf("La lista %s ordenada por burbuja es %s", Arrays.toString(lista),
				Arrays.toString(listaBurbuja(lista)));
	}

	public int[] listaBurbuja(int[] lista) {
		int valorTemporal = 0;
		for (int i = 0; i < lista.length; i++) {// iteraciones = length del array
			for (int j = 0; j < lista.length; j++) {// empujar el numero mas grande al final
				if (j + 1 < lista.length) {
					if (lista[j] > lista[j + 1]) {
						valorTemporal = lista[j + 1];
						lista[j + 1] = lista[j];
						lista[j] = valorTemporal;

					}
				}
			}

		}

		return lista;
	}

	public static void main(String[] args) {

		new Ejercicio3().show();
	}

}
