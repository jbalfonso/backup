package _03ejercicios;

import java.util.Scanner;

public class _12Medidas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,pulgadas,yardas,cm,m;
		Scanner tec = new Scanner(System.in);
		System.out.println("Coversor de medidas, introduzca pies");
		a = tec.nextInt();
		pulgadas = a * 12.0;
		yardas = a/3.0;
		cm = pulgadas*2.54;
		m = cm*100;
		System.out.println("Coversion realizada");
		System.out.println("Valor introducido pies: " + a);
		System.out.println("Pulgadas: " + pulgadas);
		System.out.println("Yardas: " + yardas);
		System.out.println("Centimentros: " + cm);
		System.out.println("Metros: " + m);
	}

}
