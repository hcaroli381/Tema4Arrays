package ejercicios4_1arraysComoParametros;

public class Ejercicio6 {
	public void show() {
		int [] lista = {2,3,4,4,3,2};
		if (capicua(lista)) {
			System.out.println("{2,3,4,4,3,2}");
			System.out.println("El array es capicua");
		}else{
			System.out.println("{2,3,4,4,1,2}");
			System.out.println("El array no es capicua");
		};
	}
	
	public boolean capicua(int[] lista) {
		int[] nLista;
		if(lista.length<2) {
			return true;
		}else if(lista[0]!=lista[lista.length-1]){
			return false;
		}else {
			nLista = new int [lista.length-2];
			for(int i = 0; i<nLista.length;i++) {
				nLista[i]=lista[i+1];
			}
			return capicua(nLista);
		}
	}
	public static void main(String[] args) {
		new Ejercicio6().show();
		
		
	}

}
