package baitapchuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LaoDongPhoThong extends NguoiLaoDong {
	private double soNgayCong;
	private double donGiaNgayCong;
	private int thuong;
	
	public LaoDongPhoThong() {
	}
	

	public LaoDongPhoThong(double soNgayCong, double donGiaNgayCong, int thuong) {
		super();
		this.soNgayCong = soNgayCong;
		this.donGiaNgayCong = donGiaNgayCong;
		this.thuong = thuong;
	}
	


	public double getSoNgayCong() {
		return soNgayCong;
	}


	public void setSoNgayCong(double soNgayCong) {
		this.soNgayCong = soNgayCong;
	}


	public double getDonGiaNgayCong() {
		return donGiaNgayCong;
	}


	public void setDonGiaNgayCong(double donGiaNgayCong) {
		this.donGiaNgayCong = donGiaNgayCong;
	}


	public int getThuong() {
		return thuong;
	}


	public void setThuong(int thuong) {
		this.thuong = thuong;
	}
	
	public void nhapThongTin() {
		super.nhapThongTin();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Nhập số ngày công: ");
			soNgayCong = sc.nextDouble();
			System.out.print("Nhập đơn giá ngày công: ");
			donGiaNgayCong = sc.nextDouble();
			if(soNgayCong < 0 || donGiaNgayCong < 0) {
				throw new InputMismatchException("So ngay cong va don gia khong the nho hon 0!");
				
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Lỗi! " + e.getMessage() + " Vui lòng nhập lại! ");
			nhapThongTin();
		}
	}


	@Override
	public double tinhLuong() {
		double luong = soNgayCong * donGiaNgayCong;
		if(soNgayCong >= 25) {
			thuong = 1000000;
		}
		else if(soNgayCong > 15 || soNgayCong < 25) {
			thuong = 700000;
		}
		return luong + thuong;
	}
	
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Số ngày công: " + soNgayCong);
		System.out.println("Đơn giá ngày công: " + donGiaNgayCong);
	}


	

}
