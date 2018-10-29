package _03ejercicios;

import java.util.Scanner;

public class _20NotasTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Introducir nota: ");
		int nota = tec.nextInt();
		if (nota >= 9)
			System.out.println("Sobresaliente");
		else if (nota <= 4)
			System.out.println("Insuficiente");
		else if (nota == 5)
			System.out.println("Suficiente");
		else if (nota == 6)
			System.out.println("Suficiente");
		else if (nota == 7)
			System.out.println("Bien");
		else
			System.out.println("Notable");
	}

}
