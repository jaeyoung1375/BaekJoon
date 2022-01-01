import java.util.Scanner;

public class P_2884 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		
		if (H== 0 && M<45) {
			System.out.println(H+23+" "+(M+15));
		}else if(M<45) {
			System.out.println(H-1 +" "+(M+15));
			
		}
		else if(M>=45) {
			System.out.println(H +" "+(M-45));
		}
	}

}
