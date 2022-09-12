package aula0909;

public class ForContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i= 0; i < 100; i++) {
			if (i > 50 && i < 60) {
				continue;
			}
			System.out.println(i);
		}
	}

}
