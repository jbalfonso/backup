package _03ejercicios;

import java.util.Scanner;

public class _13Segundos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundos, d, h, m, s;
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce cantidad de segundos");
		segundos = tec.nextInt();
		
		//dias
		d = segundos / 86400;
		s = segundos % 86400;
		
		//horas
		h = s / 3600;
		s = s % 3600;
		
		//minutos
		m = s /60;
		s = s % 60;
		
		System.out.println(segundos +" Son");
		System.out.println(d +" dias");
		System.out.println(h +" horas");
		System.out.println(m +" minutos");
		System.out.println(s +" segundos");

	}

}
