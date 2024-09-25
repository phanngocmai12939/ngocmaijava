package baitap2_nhapxuat;

import java.util.Scanner;

public class nhapxuat {

			public static void main(String[] args) {
				
				System.out.println("-------NHẬP XUẤT");
				
				// KHAI BÁO CÁC BIẾN CHỨA DỮ LIỆU NHẬP VÀO
				String hoTen;
				int tuoi;
				Double chieuCao;
				Double canNang;
				
				//TẠO ĐỐI TƯỢNG SCANNER ĐỂ NHẬP DỮ LIỆU
				Scanner banPhim;//Khai báo
				banPhim = new Scanner(System.in);
				
				//XIN MỚI
				//ĐỌC DỮ LIỆU TỪ BÀN PHÍM, CẤT VÀO CÁC BIẾN TƯƠNG ỨNG
				//IN RA HƯỚNG DẪN CHO USER BIẾT, CẦN LÀM GÌ
				System.out.println("Họ Tên?");
				hoTen = banPhim.nextLine();
				System.out.println("Tuổi?");
				tuoi = banPhim.nextInt();
				System.out.println("Chiều cao (m)?");
				chieuCao = banPhim.nextDouble();
				System.out.println("Cân nặng (Kg)?");
				canNang = banPhim.nextDouble();
				
				//XUẤT THÔNG TIN
				System.out.println("=================");
				System.out.println("Name: " + hoTen);
				System.out.println("Age: " + tuoi);
				System.out.println("Weight: " + canNang);
				System.out.println("Height: " +chieuCao);
				System.out.println("=================");
			
	}

}
