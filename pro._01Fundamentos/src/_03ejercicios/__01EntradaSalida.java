package _03ejercicios;

import java.util.Scanner;

public class __01EntradaSalida {
	public static void main (String[] args){
		Scanner tec = new Scanner(System.in);
		int a, b;
		System.out.println("Introduce un numero entero");
		a = tec.nextInt();
		System.out.println("Introduce otro numero entero");
		b = tec.nextInt();
		System.out.println("Los numeros introducidos son " + a + " y " +b);
	}
}