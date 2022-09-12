package aula0909;

public class ForBreak {

	public static void main(String[] args) {
		int x = 1;
		int y = 90;
		
		for (int i = x; i < y; i++) {
			if (i % 5 == 0) {
				System.out.println("Achei um número entre x e y que é divisível por 5: "+ i);
				break;
			}
		}


	}

}
