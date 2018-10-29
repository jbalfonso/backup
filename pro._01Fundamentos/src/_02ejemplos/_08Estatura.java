package _02ejemplos;

import java.util.Scanner;

public class _08Estatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);

		System.out.println("Estatura: ");
		double estatura = tec.nextDouble();

		if (estatura >= 2) {
			System.out.println("Muy alto");
		} else { 
			if (estatura > 1.7){
				System.out.println("Alto");
		} else {
			if (estatura > 1.6) {
				System.out.println("Estatura media");
			} else {
				System.out.println("Bajo");
			}

			// De otra forma: sin llaves

			if (estatura >= 2)
				System.out.println("Muy alto");
			else if (estatura > 1.7)
				System.out.println("Alto");
			else  if (estatura > 1.6)
				System.out.println("Estatura media");
			else
				System.out.println("Bajo");

		}
	}
}
}
