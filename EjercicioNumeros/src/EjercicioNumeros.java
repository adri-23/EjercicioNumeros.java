import java.util.Scanner;

public class EjercicioNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Debe diseñar un programa que reciba 3 números por consola
		 *  y determine cual de los 3 números es el mayor.
           Plus: Imprimir los números ordenados de mayor a menor.
           Plus: Imprimir los números ordenados de menor a mayor.
		 */
		
		Scanner nieve = new Scanner(System.in);
		System.out.println("introduce numero1");
		int valor1= nieve.nextInt();
		System.out.println("introduce numero2");
		int valor2=nieve.nextInt();
		System.out.println("introduce numero3");
		int valor3=nieve.nextInt();
		
		if (valor1>valor2 && valor1>valor3) {
			System.out.println("el numero mayor es: " + valor1);
			System.out.println("mayor " + valor1+","+valor2+","+valor3);
			System.out.println("mayor " + valor3+","+valor2+","+valor1);
		} 
		else if(valor2>valor1 && valor2>valor3) {
			System.out.println("el numero mayor es: " + valor2);
			System.out.println("mayor " + valor2+","+valor1+","+valor3);
			System.out.println("mayor " + valor3+","+valor1+","+valor2);
		}
		else if(valor3>valor1 && valor3>valor2) {
			System.out.println("el numero mayor es: " + valor3);
			System.out.println("mayor " + valor3+","+valor1+","+valor2);
			System.out.println("mayor " + valor2+","+valor1+","+valor3);
		}		
		else {
			
			System.out.println("los numeros son iguales");
			
		}
	}
	
		
}
