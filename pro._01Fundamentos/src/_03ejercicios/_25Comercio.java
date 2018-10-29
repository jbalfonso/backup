package _03ejercicios;

import java.util.Scanner;

public class _25Comercio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double desc, resta;
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduzca importe de la compra");
		double imp = tec.nextDouble();
		desc = (imp * 8) / 100;
		
		if (desc>=12){
			System.out.println("No se realiza descuento ");
			System.out.println("Cantidad a pagar " +imp+"eur");
		} else {
		}
			if (imp>40) {
			System.out.println("Porcentaje del descuento aplicado: 8%");
			System.out.println("Descuento aplicado: " +desc+"eur");
			desc = (imp * 8) / 100;
			resta = imp-desc;
			System.out.println("Cantidad a pagar: " + resta+ "eur");
		} else {
			System.out.println("No se realiza descuento ");
			System.out.println("Cantidad a pagar " +imp+"eur");
		}
		}
	}

