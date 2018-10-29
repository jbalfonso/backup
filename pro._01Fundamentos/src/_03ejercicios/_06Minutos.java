package _03ejercicios;

import java.util.Scanner;

public class _06Minutos {
	public static void main (String[] args){
		int a,b,c;
		System.out.println("Introducir segundos");
		Scanner tec = new Scanner(System.in);
		a = tec.nextInt();
		b = a/60;
		c = a%60;
		System.out.println("El valor introducido es " + b + " minutos y " + c + " segundos");
	}

}
