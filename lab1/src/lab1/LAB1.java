package lab1;

public class LAB1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Họ và tên: ");
		String hoTen = scanner.nextLine();
		System.out.print("Điểm TB: ");
		double diemTB = scanner.nextDouble();
		System.out.println("------Thông tin điểm sinh viên-----");
		System.out.printf("%s: %.1f điểm", hoTen,diemTB);
	}

}
