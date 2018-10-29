package _03ejercicios;

import java.util.Scanner;

public class _07Horas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Introducir segundos");
		Scanner tec = new Scanner(System.in);
		a = tec.nextInt();
		b = a/60;
		c = a%60;
		System.out.println("Ese valor es " + b + " Hora y " + c + " minutos");

	}

}
