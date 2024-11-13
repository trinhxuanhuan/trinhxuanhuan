package baitapchuong3;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		//Chọn loại học viên
		Scanner sc = new Scanner(System.in);
		System.out.println("Chọn loại học viên: (1-Học viên đồ họa, 2- Học viên lập trình): ");
		int loaiHocVien = sc.nextInt();
		sc.nextLine();
		if(loaiHocVien == 1) {
			HocVienDH hvdh = new HocVienDH();
			hvdh.nhapThongTin();
			hvdh.inThongTin();
			
		}
		else {
			HocVienLT hvlt = new HocVienLT();
			hvlt.nhapThongTin();
			hvlt.inThongTin();
		}
			
	}

}
