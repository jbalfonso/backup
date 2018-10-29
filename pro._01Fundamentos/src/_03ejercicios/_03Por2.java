package _03ejercicios;

import java.util.Scanner;

public class _03Por2 {
	public static void main (String[] args){
		Scanner tec = new Scanner (System.in);
		
		System.out.println("Escribe un numero");
		int num = tec.nextInt();
		int doble = num * 2;
		
		System.out.println("El doble de " + num + " es " + doble);
		
	}

}
