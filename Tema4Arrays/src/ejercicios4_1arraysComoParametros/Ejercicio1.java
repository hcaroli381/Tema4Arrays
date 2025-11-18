package ejercicios4_1arraysComoParametros;

public class Ejercicio1 {
	public void show() {
		System.out.println("El array es 1, 2, 4, 5.\nLa multiplicacion de esos numeros es : ");
		System.out.println(add(1, 2, 4, 5));

	}

	public int add(int... nums) {
		int multiplicacion = 1; // importante =1 y no =0 para multiplicacion

		for (int i = 0; i < nums.length; i++) {
			multiplicacion *= nums[i];
		}

		return multiplicacion;
	}

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

}
