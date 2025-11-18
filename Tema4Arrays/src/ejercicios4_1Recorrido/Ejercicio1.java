package ejercicios4_1Recorrido;

public class Ejercicio1 {
	public void exercise1() {
		int numeros[] = { 2, 1, 199, 9, 42, 52223, 63 };
		String comprobar = "";

		System.out.println("Los valores del array son : { 2, 1, 199, 9, 42, 52223, 63 } ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				comprobar = "par";

			} else {
				comprobar = "impar";
			}
			System.out.printf("La posicion %d es %s\n", i, comprobar);
		}
	}

	public static void main(String[] args) {
		new Ejercicio1().exercise1();
	}

}
