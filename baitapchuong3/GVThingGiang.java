package baitapchuong3;

import java.util.Scanner;

public class GVThingGiang extends GiangVien {
	private int soTietDay;
	private double donGia;
	public GVThingGiang() {
	}
	

	public GVThingGiang(int soTietDay, double donGia) {
		super();
		this.soTietDay = soTietDay;
		this.donGia = donGia;
	}
	


	public int getSoTietDay() {
		return soTietDay;
	}


	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}


	public double getDonGia() {
		return donGia;
	}


	public void setDonGia(double donGia) {
		this.donGia = donGia;
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
			System.out.println("So tiet day: ");
			soTietDay = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhapdon gia: ");
			donGia = sc.nextDouble();
			sc.nextLine();
			if(soTietDay < 0 || donGia < 0) {
				System.out.println("So tiet day va don gia khong the la so am");
			}
			
		} catch (Exception e) {
			System.out.println("Loi! Vui long nhap lai!");
			nhapThongTin();
		}
		
	}

	@Override
	public double tinhLuong() {
		double luong = soTietDay * donGia;
		double thuNhap = 0.15 * (soTietDay - donGia);
		
		return luong - thuNhap;
	}

}
