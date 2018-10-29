package _03ejercicios;

import java.util.Scanner;

public class _15UltimaCifra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce un numero entero:");
		int entero = tec.nextInt();
		int res = entero%10;
		System.out.println("La ultima cifra de "+entero+" es "+res);
		
	}

}
