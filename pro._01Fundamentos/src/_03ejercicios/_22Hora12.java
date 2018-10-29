package _03ejercicios;

import java.util.Scanner;

public class _22Hora12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce hora: ");
		int hora = tec.nextInt();
		System.out.println("Introduce minutos: ");
		int minutos = tec.nextInt();
		int hora2 = hora-12;
		
		if (hora==24)
			System.out.println("Las " + hora + ":" + minutos + " son las " + " 12"+":"+minutos + " AM ");
		else if (hora==00)
			System.out.println("Las " + hora + ":" + minutos + " son las " + "12"+":"+minutos + " AM ");
		else if (hora>12)
			System.out.println("Las " + hora + ":" + minutos + " son las " + hora2+":"+minutos + " PM ");
		else
			System.out.println("Las " + hora + ":" +minutos + " son las " + hora+":" +minutos + " AM ");
		
		
		//System.out.println("Las " + hora + ":" + minutos +" son las " + );
	}

}
