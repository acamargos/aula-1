package aula0909;

import java.util.Scanner;

public class bissexto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe o ano para validar se � um ano bissexto: ");
		int ano = sc.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("o ano " + ano + " � bissexto");
		} else {
			System.out.println("o ano " + ano+ " n�o � bissexto");
		}
	sc.close();	
	}

}
