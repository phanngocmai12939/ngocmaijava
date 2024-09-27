package lab2;
import java.util.Scanner;
public class LAB2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		float x, y, dienTich, chuVi;
		System.out.print("Nhap chieu dai: ");
		x = scanner.nextFloat();
		System.out.print("Nhap chieu rong: ");
		y = scanner.nextFloat();
		dienTich = x * y;
		chuVi = (x + y) * 2;
		System.out.println("Chu vi hinh chu nhat la :" + chuVi);
		System.out.printf("Dien tich hinh chu nhat la :%.2f", dienTich);
		System.out.println("Canh nho nhat la : " + Math.min(x , y));

	}

}
