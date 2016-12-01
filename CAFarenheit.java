package CAFarenheit;

import java.util.Scanner;

public class CAFarenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//F = 32 + ( 9 * C / 5)
		Scanner src = new Scanner(System.in);
		
		System.out.println("Introduce los grados centígrados ");
		
		double A;
		double B;
		
		A = src.nextDouble();
		
		B= 32 + (9*A/5);
		
		
		System.out.println(A+"centígrados, son "+B+" grados Farenheit");
		
	}

}
