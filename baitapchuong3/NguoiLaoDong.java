package baitapchuong3;

import java.util.Scanner;

public abstract class NguoiLaoDong {
	protected String hoTen;
	protected String diaChi;
	protected String loaiLaoDong;
	
	public NguoiLaoDong() {}

	public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiLaoDong() {
		return loaiLaoDong;
	}

	public void setLoaiLaoDong(String loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}

	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		hoTen = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		diaChi = sc.nextLine();
		System.out.println("Nhập loaih lao đông: ");
		loaiLaoDong = sc.nextLine();
		
	}
	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Loại lao đông: " + loaiLaoDong);
		System.out.println("Lương: " + tinhLuong());
	}
	
	public abstract double tinhLuong();
	
	

}
