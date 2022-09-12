package aula0909;

import java.util.Random;
import java.util.Scanner;

/**
 * Esta classe realiza sorteios
 */
public class Sorteio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int sorteado = r.nextInt(100);

		System.out.println("Digite um número de zero a 99: ");
		int nro = sc.nextInt();

		while (nro != sorteado) {
			if (nro < sorteado) {
				System.out.println("MAIOR");
			} else {
				System.out.println("MENOR");
			}
			System.out.println("Tente de novo...Digite um número de zero a 99: ");
			nro = sc.nextInt();

		}
		System.out.println("Parabéns você acertou!");
		sc.close();
	}
}
