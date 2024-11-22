package baitapchuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CNKSP extends CongNhan {
	private int soSanPham;
	private double donGiaSP;
	private int thuong;
	
	public CNKSP() {
	}
	

	public CNKSP(int soSanPham, double donGiaSP, int thuong) {
		super();
		this.soSanPham = soSanPham;
		this.donGiaSP = donGiaSP;
		this.thuong = thuong;
	}
	


	public int getSoSanPham() {
		return soSanPham;
	}


	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}


	public double getDonGiaSP() {
		return donGiaSP;
	}


	public void setDonGiaSP(double donGiaSP) {
		this.donGiaSP = donGiaSP;
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
			System.out.print("Số sản phẩm: ");
			soSanPham = sc.nextInt();
			System.out.print("Nhập Đơn giá sản phẩm: ");
			donGiaSP = sc.nextDouble();
			if(soSanPham < 0 || donGiaSP < 0) {
				throw new InputMismatchException("Số sp và đơn giá sp khong the nho hon 0!");
				
			}
			
			
		} catch (InputMismatchException e) {
			System.out.println("Lỗi! " + e.getMessage() + " Vui lòng nhập lại! ");
			nhapThongTin();
		}
	}


	@Override
	public double tinhLuong() {
		double luong = soSanPham * donGiaSP;
		if(soSanPham <= 50) {
			thuong = 0;
		}
		else if(soSanPham <= 150) {
			thuong = 1000000;
		}
		else {
			thuong = 1500000;
		}
		return luong + thuong;
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Số sản phẩm: " + soSanPham);
		System.out.println("Đơn giá: " + donGiaSP);
	}

}
