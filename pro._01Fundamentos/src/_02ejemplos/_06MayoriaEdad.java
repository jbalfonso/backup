package _02ejemplos;

import java.util.Scanner;

public class _06MayoriaEdad {
	public static void main(String[] args){
	Scanner tec = new Scanner(System.in);
	System.out.println("Edad: ");
	int edad = tec.nextInt();
	
	if (edad >= 18){
		System.out.println("Tienes " + edad + " años");
		System.out.println("Eres mayor de edad");
	} else {
		System.out.println("Tienes " + edad + " años");
		System.out.println("Eres menor de edad");
	}
	
	//a = tec.nextInt();
	}
}
