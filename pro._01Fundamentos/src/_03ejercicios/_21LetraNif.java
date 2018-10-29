package _03ejercicios;

import java.util.Scanner;

public class _21LetraNif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Introducir numero Nif: ");
		int dni = tec.nextInt();
		int num = dni%23;
		
		if (num == 0)
			System.out.println("T");
		else if (num == 1)
			System.out.println("R");
		else if (num == 2)
			System.out.println("W");
		else if (num == 3)
			System.out.println("A");
		else if (num == 4)
			System.out.println("G");
		else if (num == 5)
			System.out.println("M");
		else if (num == 6)
			System.out.println("Y");
		else if (num == 7)
			System.out.println("F");
		else if (num == 8)
			System.out.println("P");
		else if (num == 9)
			System.out.println("D");
		else if (num == 10)
			System.out.println("X");
		else if (num == 11)
			System.out.println("B");
		else if (num == 12)
			System.out.println("N");
		else if (num == 13)
			System.out.println("J");
		else if (num == 14)
			System.out.println("Z");
		else if (num == 15)
			System.out.println("S");
		else if (num == 16)
			System.out.println("Q");
		else if (num == 17)
			System.out.println("V");
		else if (num == 18)
			System.out.println("H");
		else if (num == 19)
			System.out.println("L");
		else if (num == 20)
			System.out.println("C");
		else if (num == 21)
			System.out.println("K");
		else if (num == 22)
			System.out.println("E");
		
	}

}
