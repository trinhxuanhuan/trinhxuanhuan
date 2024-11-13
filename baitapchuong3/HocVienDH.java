package baitapchuong3;

import java.util.Scanner;

public class HocVienDH extends HocVien{
	private double hocPhiDoHoa;
	private int soBuoi;
	

	public HocVienDH() {
	}
	
	public HocVienDH(double hocPhiDoHoa) {
		super();
		this.hocPhiDoHoa = hocPhiDoHoa;
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
			System.out.println("Nhập đơn giá đồ họa: ");
			hocPhiDoHoa = sc.nextDouble();
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
		double hocPhi = hocPhiDoHoa * soBuoi;
		if(loaiUuTien == 1) {
			hocPhi -= 1000000;
		}
		else {
			hocPhi -= 500000;
		}
		return hocPhi;

	}

	

}
