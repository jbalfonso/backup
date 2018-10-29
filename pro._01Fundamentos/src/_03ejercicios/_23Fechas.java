package _03ejercicios;

import java.util.Scanner;

public class _23Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tec = new Scanner(System.in);
		int dia1,mes1,año1,dia2,mes2,año2, total1, total2;
		System.out.println("Introducir dia1");
		dia1 = tec.nextInt();
		System.out.println("Introducir mes1");
		mes1 = tec.nextInt();
		System.out.println("Introducir año1");
		año1 = tec.nextInt();
		System.out.println("Introducir dia2");
		dia2 = tec.nextInt();
		System.out.println("Introducir mes2");
		mes2 = tec.nextInt();
		System.out.println("Introducir año2");
		año2 = tec.nextInt();
		
		//Correccion Javi
		if(año1<año2)
			System.out.println(dia1 +"/"+mes1+"/"+año1);
		else if (año1 >año2)
			System.out.println(dia2+"/"+mes2+"/"+año2);
		else
			if (mes1<mes2)
				System.out.println(dia1+"/"+mes1+"/"+año1);
			else if (mes1>mes2)
				System.out.println(dia2+"/"+mes2+"/"+año2);
			else
				if (dia1<dia2)
					System.out.println(dia1 +"/"+mes1+"/"+año1);
				else if (dia1>dia2)
					System.out.println(dia2+"/"+mes2+"/"+año2);
				else
					System.out.println("Las fechas son iguales");
		
		//CORRECCION ESTHER 1ED
		/*if (año1==año2) {
			if (mes1==mes2){
				if(dia1==dia2){
					System.out.println("Son iguales");
				}else if(dia1<dia2){
					System.out.println(dia1 +"/"+mes1+"/"+año1);
				}else{
					System.out.println(dia2+"/"+mes2+"/"+año2);
				}
			
			}else if(mes1<mes2){
				System.out.println(dia1 +"/"+mes1+"/"+año1);
			}else{
				System.out.println(dia2+"/"+mes2+"/"+año2);
			}
			
			}else if (año1<año2){
				System.out.println(dia2+"/"+mes2+"/"+año2);
			}else{
				
				System.out.println(dia1 +"/"+mes1+"/"+año1);
			}
			}
		*/
		//MIO PAMI
		//total1 = dia1+mes1+año1;
		//total2 = dia2+mes2+año2;
		//if (total1>total2)
		//	System.out.println(dia2+"/"+mes2+"/"+ año2);
		//else
		//	System.out.println("La fecha menor es " +dia1+"/"+mes1+"/"+año1);
	}
}


