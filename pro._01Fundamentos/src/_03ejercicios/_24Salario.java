package _03ejercicios;

import java.util.Scanner;

public class _24Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		double ordinarias, extra, bruto, imp, resta;
		System.out.println("Introducir horas semanales trabajadas");
		int horas = tec.nextInt();

		if (horas <= 40) {
			bruto = horas * 6;
			System.out.println("bruto = " + bruto);
		} else {
			extra = (horas - 40) * 10;
			ordinarias = 40 * 6;
			bruto = extra + ordinarias;
			System.out.println("bruto = " + bruto);
		}
		if (bruto <= 350) {
			imp = (bruto * 2) / 100;
			resta = bruto - imp;
			System.out.println("Tu salario neto es " + resta);
		} else {
			imp = (bruto * 10) / 100;
			resta = bruto - imp;
			System.out.println("Tu salario neto es " + resta);
		
		}

	}
}
