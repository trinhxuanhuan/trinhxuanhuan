package baitapchuong3;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double luongCoBan;
	private double heSoLuong;
	private int thamNien;
	public GVCoHuu() {}


	public GVCoHuu(double luongCoBan, double heSoLuong, int thamNien) {
		super();
		this.luongCoBan = luongCoBan;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
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


	public int getThamNien() {
		return thamNien;
	}


	public void setThamNien(int thamNien) {
		this.thamNien = thamNien;
	}


	@Override
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap dia chi: ");
		diaChi = sc.nextLine();
		System.out.println("Loai giang vien: ");
		loaiGiangVien = sc.nextLine();
		try {
			
			System.out.println("Nhap luong co ban: ");
			luongCoBan = sc.nextDouble();
			sc.nextLine();
			System.out.println("Nhap he so luong: ");
			heSoLuong = sc.nextDouble();
			sc.nextLine();
			System.out.println("Nhap tham nien: ");
			thamNien = sc.nextInt();
			sc.nextLine();
			if(luongCoBan <= 0 || heSoLuong <= 0 || thamNien < 0) {
				System.out.println("Luong co ban, He so luong, Tham nien khong the la so am");
			}
			
		} catch (Exception e) {
			System.out.println("Loi! Vui long nhap lai!");
		}

		
		
	}

	@Override
	public double tinhLuong() {
		double luong = luongCoBan * heSoLuong;
		double phuCap;
		if(thamNien < 5) {
			phuCap = 0;
			}
		else {
			phuCap = luongCoBan * (0.05 + 0.01 * (thamNien - 5));
		}
		return luong + phuCap;
	}

}
