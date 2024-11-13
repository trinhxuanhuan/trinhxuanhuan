package baitapchuong3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
	protected String lop;
	protected String nganh;
	protected Truong truong;
	
	public SinhVien() {}

	public SinhVien(String lop, String nganh, Truong truong) {
		super();
		this.lop = lop;
		this.nganh = nganh;
		this.truong = truong;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}

	public Truong getTruong() {
		return truong;
	}

	public void setTruong(Truong truong) {
		this.truong = truong;
	}
	public void nhapThongTinhSV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên sinh viên: ");
		ten = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính: ");
		gioiTinh = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhập tên lớp: ");
		lop = sc.nextLine();
		System.out.println("Nhập tên ngành: ");
		nganh = sc.nextLine();
		Truong truong = new Truong();
		System.out.println("Nhập tên trường: ");
		truong.setTenTruong(sc.nextLine());
		System.out.println("Nhập địa chỉ trường: ");
		truong.setDiaChi(sc.nextLine());
		System.out.println("Nhập tên hiệu trưởng: ");
		truong.setHieuTruong(sc.nextLine());
		this.truong = truong;
	}

	@Override
	public String toString() {
		return super.toString() +  "SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong.toString() + "]";
	}
	

}
