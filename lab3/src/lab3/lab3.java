package lab3;
import java.util.Scanner;
public class lab3 {

	public static void main(String[] args) {
			float canh;
			Scanner scanner = new Scanner(System.in);
			System.out.print("Nhap vao kich thuoc canh cua hinh lap phuong: ");
			canh = scanner.nextFloat();
			float thetich = canh * canh * canh;
			thetich = (float) Math.pow(canh, 3) ;
			System.out.printf("The tich cua khoi lap phuong la  : %f" , thetich);

	}

}
