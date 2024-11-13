package baitapchuong3;

import java.util.Scanner;

public class DiaChi {
	private String thon;
	private String xa;
	private String huyen;
	private String tinh;
	public DiaChi(){}
	public DiaChi(String thon, String xa, String huyen, String tinh) {
		super();
		this.thon = thon;
		this.xa = xa;
		this.huyen = huyen;
		this.tinh = tinh;
	}
	public String getThon() {
		return thon;
	}
	public void setThon(String thon) {
		this.thon = thon;
	}
	public String getXa() {
		return xa;
	}
	public void setXa(String xa) {
		this.xa = xa;
	}
	public String getHuyen() {
		return huyen;
	}
	public void setHuyen(String huyen) {
		this.huyen = huyen;
	}
	public String getTinh() {
		return tinh;
	}
	public void setTinh(String tinh) {
		this.tinh = tinh;
	}
	public void nhapThongTinDiaChi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập thôn(Hoặc tổ dân phố): ");
		thon = sc.nextLine();
		System.out.println("Nhập xã(Hoặc phường): ");
		xa = sc.nextLine();
		System.out.println("Nhập quận(Hoặc Huyện): ");
		huyen = sc.nextLine();
		System.out.println("Nhập tỉnh(Hoặc thành phố): ");
		tinh = sc.nextLine();
	}
	@Override
	public String toString() {
		return "DiaChi [thon=" + thon + ", xa=" + xa + ", huyen=" + huyen + ", tinh=" + tinh + "]";
	}
	
	

}
