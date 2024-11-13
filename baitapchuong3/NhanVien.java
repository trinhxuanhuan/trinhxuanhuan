package baitapchuong3;

import java.util.Scanner;

public class NhanVien {
	private String name;
	private DiaChi address;
	private String dob;
	private char gender;
	public NhanVien() {}
	public NhanVien(String name, DiaChi address, String dob, char gender) {
		super();
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DiaChi getAddress() {
		return address;
	}
	public void setAddress(DiaChi address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void nhapThongTinNV() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		dob = sc.nextLine();
		System.out.println("Nhập giới tính(M- Nam, F- Nữ): ");
		gender = sc.next().charAt(0);
		DiaChi address = new DiaChi();
		System.out.println("Nhập thôn: ");
		address.setThon(sc.nextLine());
		sc.nextLine();
		System.out.println("Nhập Xã: ");
		address.setXa(sc.nextLine());
		System.out.println("Nhập Huyện: ");
		address.setHuyen(sc.nextLine());
		System.out.println("Nhập tỉnh: ");
		address.setTinh(sc.nextLine());
		this.address = address;


	}
	@Override
	public String toString() {
		return "NhanVien [name=" + name + ", address=" + address + ", dob=" + dob + ", gender=" + gender + "]";
	}
	

}
