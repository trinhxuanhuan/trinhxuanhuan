package baitapchuong3;

import java.util.Scanner;

public class BenhNhan extends Nguoi {
	protected String tienSu;
	protected String chanDoan;
	protected BenhVien benhVien;
	
	public BenhNhan() {}

	public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
		super();
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}

	public String getTienSu() {
		return tienSu;
	}

	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}

	public String getChanDoan() {
		return chanDoan;
	}

	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}

	public BenhVien getBenhVien() {
		return benhVien;
	}

	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	public void nhapThongTinBN() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		ten = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		tuoi = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính(N/M): ");
		gioiTinh = sc.next().charAt(0);
		System.out.println("Nhập tiền sử: ");
		tienSu = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập chẩn đoán: ");
		chanDoan = sc.nextLine();
		BenhVien benhVien = new BenhVien();
		System.out.println("Nhập tên bệnh viện: ");
		benhVien.setTenBenhVien(sc.nextLine());
		System.out.println("Nhập địa chỉ bệnh viện: ");
		benhVien.setDiaChi(sc.nextLine());
		System.out.println("Nhập giám đốc: ");
		benhVien.setGiamDoc(sc.nextLine());
		this.benhVien = benhVien;
		
	}

	@Override
	public String toString() {
		return super.toString() + "BenhNhan [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien.toString() + "]";
	}
	
	

}
