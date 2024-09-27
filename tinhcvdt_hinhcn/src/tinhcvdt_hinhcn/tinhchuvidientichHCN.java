
package tinhcvdt_hinhcn;

public class tinhchuvidientichHCN {

	public static void main(String[] args) {
		
			HinhChuNhat hcn = new HinhChuNhat();
			Scanner scanner = new Scanner(System.in);
			System.out.println("nhập vào chiều dài : ");
			hcn.setDai(scanner.nextDouble());
			System.out.println("nhập vào chiều rộng : ");
			hcn.setRong(scanner.nextDouble());
			
			//gọi hàm tính chu vi và diện tích ở class HinhChuNhat bằng cách sử dụng object vừa mới được tạo là hcn
			
			System.out.println("chu vi hình chữ nhật là : " + hcn.tinhChuVi());
			System.out.println("diện tích hình chữ nhật là : " + hcn.tinhDienTich());
			System.out.println("----------------------end----------------------------");
	}

}
			
