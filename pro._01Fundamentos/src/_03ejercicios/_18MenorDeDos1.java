package _03ejercicios;

import java.util.Scanner;

public class _18MenorDeDos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner tec = new Scanner(System.in);
		System.out.println("Nº1: ");
		n1 = tec.nextInt();
		System.out.println("Nº2: ");
		n2 = tec.nextInt();
		if (n1 > n2)
			System.out.println( +n2);
		else
			System.out.println(+n1);
	}

}
