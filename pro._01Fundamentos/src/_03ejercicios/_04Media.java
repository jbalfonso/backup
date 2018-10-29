package _03ejercicios;

import java.util.Scanner;

public class _04Media {
	public static void main (String[] args){
		Scanner tec = new Scanner(System.in);
		int a, b, c, e;
		double d;
		System.out.println("Edad 1� Persona");
		a = tec.nextInt();
		System.out.println("Edad  2� Persona");
		b = tec.nextInt();
		System.out.println("Edad  3� Persona");
		c = tec.nextInt();
		System.out.println(" Edad 1� Persona = " + a + " Edad 2� Persona = " + b + " Edad 3� Persona = " + c);
		c = a+b+c;
		d = c/3.0;
		System.out.println("Edad media 3 Personas = " + d);
	}
}
