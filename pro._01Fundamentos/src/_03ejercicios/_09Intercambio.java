package _03ejercicios;

import java.util.Scanner;

public class _09Intercambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1, v2,v3,v4;
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe un numero para v1");
		v1 = tec.nextInt();
		
		System.out.println("Escribe un numero para v2");
		v2 = tec.nextInt();
		
		System.out.println("Antes de intercambiar V1: " + v1 + " y V2: " + v2);
		v3 = v2;
		v4 = v1;
		
		System.out.println("Despues de intercambiar V1: " + v3 + " y V2: " + v4);
	}

}
