package baitapchuong3;

import java.util.Scanner;

public abstract class CongNhan {
	protected String hoTen;
	protected String diaChi;
	protected String loaiCongNhan;
	
	public CongNhan() {
	}

	public CongNhan(String hoTen, String diaChi, String loaiCongNhan) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
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

	public String getLoaiCongNhan() {
		return loaiCongNhan;
	}

	public void setLoaiCongNhan(String loaiCongNhan) {
		this.loaiCongNhan = loaiCongNhan;
	}
	
	public void nhapThongTin() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap ho ten:");
			hoTen = sc.nextLine();
			System.out.print("Nhap dia chi: ");
			diaChi = sc.nextLine();
			System.out.print("Nhap loai cong nhan: ");
			loaiCongNhan = sc.nextLine();
		}
	
     public abstract double tinhLuong();
     
     public void inThongTin() {
    	 System.out.println("Họ tên: " + hoTen);
    	 System.out.println("Địa chỉ: " + diaChi);
    	 System.out.println("Loại công nhân: " + loaiCongNhan);
    	 System.out.println("Lương: " + tinhLuong());
     }
	}


