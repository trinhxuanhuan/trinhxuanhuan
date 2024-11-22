package baitapchuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KySu extends NguoiLaoDong{
	private double luongCoBan;
	private double heSoLuong;
	private int thuong;
	private double soNgayCong;
	
	public KySu() {
	}
	
	public KySu(double luongCoBan, double heSoLuong, int thuong, double soNgayCong) {
		super();
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thuong = thuong;
		this.soNgayCong = soNgayCong;
	}
	

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public int getThuong() {
		return thuong;
	}

	public void setThuong(int thuong) {
		this.thuong = thuong;
	}

	public double getSoNgayCong() {
		return soNgayCong;
	}

	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}

	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập lương cơ bản: ");
			luongCoBan = sc.nextDouble();
			System.out.print("Nhập hệ số lương: ");
			heSoLuong = sc.nextDouble();
			System.out.print("Nhập số ngày công: ");
			soNgayCong = sc.nextDouble();
			if(luongCoBan < 0 || heSoLuong < 0 || soNgayCong < 0) {
				throw new InputMismatchException("Lương cơ bản, hệ sôs lương và số ngày khong the nho hon 0!");
				
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Lỗi! " + e.getMessage() + " Vui lòng nhập lại! ");
			nhapThongTin();
		}
	}


	@Override
	public double tinhLuong() {
		double luong = luongCoBan * heSoLuong;
		if(soNgayCong >= 25) {
			thuong = 2000000;
		}
		else if(soNgayCong < 25 && soNgayCong > 15) {
			thuong = 1000000;
		}
		return luong + thuong;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Lương cơ bản: " + luongCoBan);
		System.out.println("Hệ số lương: " + heSoLuong);
		System.out.println("Số ngày công: " + soNgayCong);
	}

}
