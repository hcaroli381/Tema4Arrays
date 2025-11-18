package ejercicios4_1arraysComoParametros;

public class Ejercicio5 {
	
	public void histograma() {
		int[] lista= {6, 4, 4, 1, 9, 7, 5, 6, 4, 2, 3, 9, 5, 6, 4};
		int[] a=new int[10];
		//inicializo el array a 0
		for(int i = 0;i<a.length;i++) {
			a[i]=0;
		}
		//cuento veces que aparece cada numero
		for(int i=0; i<lista.length;i++) {
			int indice =lista[i];
			a[indice]=a[indice]+1;
		}
		//busco el numero mayor
		int mayor = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i]>mayor) {
				mayor = a[i];
			}
		}
		for(int i = mayor; i>0; i--) {
			for(int j = 0; j<a.length;j++) {
				if(a[j]>=i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 0;i<a.length;i++) {
			System.out.printf("%d",i);
		}
	}
	
	
	public static void main(String[] args) {
		new Ejercicio5().histograma();
		
	}

}
