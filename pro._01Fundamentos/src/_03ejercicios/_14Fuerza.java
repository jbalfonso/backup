package _03ejercicios;

import java.util.Scanner;

public class _14Fuerza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		double g = 6.693e-11;
		System.out.println("Introducir masa1");
		double m1 = tec.nextDouble();
		System.out.println("Introducir masa2");
		double m2 = tec.nextDouble();
		System.out.println("Introducir distancia entre cuerpos");
		double dist = tec.nextDouble();
		double f = (g*m1*m2)/(dist*dist);
		System.out.println("La fuerza de atracciones de: " +f);
	}

}
