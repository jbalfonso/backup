package _03ejercicios;

import java.util.Scanner;

public class _11Superficie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		Scanner tec = new Scanner(System.in);
		System.out.println("Escribe longitud");
		a = tec.nextInt();
		System.out.println("Escribe anchura");
		b = tec.nextInt();
		c = a * b;
		System.out.println("Superficie = " + c);
	}

}
