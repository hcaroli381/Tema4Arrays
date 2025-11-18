package ejercicios4_1RetornoDeArrays;

public class Ejercicio1 {
	public void insertar (char[] caracteres,char c,int posicion) {
		for(int i=caracteres.length-2;i>=posicion;i--) {
			caracteres[i+1]=caracteres[i];
		}
		caracteres[posicion]=c;
		for(int i=0;i<caracteres.length;i++) {
			System.out.printf("%s",caracteres[i]);	
			}
	}
	public static void main(String[] args) {
		char[] caracteres = {'H','o','l','a',' '};
		new Ejercicio1().insertar(caracteres,'H' , 2);
	}

}
