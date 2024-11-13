package baitapchuong3;

import java.util.Scanner;

public class HocVienLT extends HocVien {
	private int soBuoi;
	private double hocPhiLT;
	public HocVienLT() {}
	

	public HocVienLT(int soBuoi, double hocPhiLT) {
		super();
		this.soBuoi = soBuoi;
		this.hocPhiLT = hocPhiLT;
	}


	@Override
	public void nhapThongTin() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Nhập họ tên: ");
			hoTen = sc.nextLine();
			System.out.println("Nhập địa chỉ: ");
			diaChi = sc.nextLine();
			System.out.println("Nhập loại ưu tiên: ");
			loaiUuTien = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập số buổi học: ");
			soBuoi = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhập đơn giá lập trình: ");
			hocPhiLT = sc.nextDouble();
			sc.nextLine();
			
			if(loaiUuTien < 1 || loaiUuTien > 2) {
				System.out.println("Khong co loai uu tien nay!");
			}
			
		} catch (Exception e) {
			System.out.println("Lỗi! Vui lòng nhập lại!");
			nhapThongTin();
		}
		
	}

	@Override
	public double tinhHocPhi() {
		double hocPhi = soBuoi * hocPhiLT;
		if(loaiUuTien == 1) {
			hocPhi -= 1000000;
		}
		else {
			hocPhi -= 800000;
		}
		return hocPhi;
	}
	

}
