package aula0909;

import java.util.Scanner;

public class Multa {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe a velocidade atual: ");
		
		int velatual= sc.nextInt();
		
		System.out.println("Informe o limite de velocidade: ");
		
		int velmax = sc.nextInt();
		
		double multa = 0;
		
		int difvel = velatual - velmax;
		if (difvel > 31) {
			multa = 300;
			System.out.println(multa);
		} else if(difvel >= 11) {
			multa = 100;
			System.out.println(multa);
		} else if (difvel > 0) {
			multa = 50;
			System.out.println(multa);
		} else {
			System.out.println("parabens por respeitar as leis  de transito");
		}
	sc.close();		
	}
}
