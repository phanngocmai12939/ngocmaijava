package lab4;

import java.util.Scanner;

public class lab4 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float a, b, c ;
		System.out.print("Nhap vao a : ");
		a = scanner.nextFloat();
		System.out.print("Nhap vao b : ");
		b = scanner.nextFloat();
		System.out.print("Nhap vao c : ");
		c = scanner.nextFloat();
		float delta = (float) Math.pow(b,  2) - (4 * a * c);
		System.out.println("Can delta la :" + Math.sqrt(delta));

	}

}
