import java.util.Scanner;

public class P_9498 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int Score = in.nextInt();
		
		
		if (Score>=90 && Score<=100) {
			System.out.println("A");
		}else if (Score>=80 && Score<=89) {
			System.out.println("B");
		}else if (Score >=70 && Score <=79) {
			System.out.println("C");
		}else if (Score >=60 && Score <=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
