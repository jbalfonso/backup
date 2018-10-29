package _03ejercicios;

import java.util.Scanner;

public class _05IndiceMasa {
	public static void main(String[] args) {
		//IMC =Peso (kg) / altura (m)2
		Scanner sc = new Scanner(System.in);
	     System.out.println("Introducir Peso");
		int peso = sc.nextInt();
		
		System.out.println("Introducir altura");
		double altura = sc.nextDouble();
		altura = altura * altura;
		double imc = peso / altura;
		System.out.println("Tu imc es de: " + imc);
	}
}
