package _03ejercicios;

import java.util.Scanner;

public class _17Energia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		System.out.println("Introducir masa: ");
		double masa = tec.nextDouble();
		double e = masa*((2.997925*108)*(2.997925*108));
		System.out.println("La energia es = " +e);

	}

}
