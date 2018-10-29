package _02ejemplos;

import java.util.Scanner;

public class _03LeerEdad {
	public static void main (String args[]){
		Scanner tec = new Scanner(System.in);
		
		//Pedir edad
		System.out.println("Introduce tu edad: ");
		//Leemos la edad desde el teclado
		//El programa se detiene hasta que el usuario introduce algo
		// y pulsa ENTER
		int edad = tec.nextInt();
	
		//Mostramos informacion al usuario
		System.out.println("Tienes " + edad + " año ");
	}

}
