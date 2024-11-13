package baitapchuong3;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;
	public GiangVien() {
	}
	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
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
	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}
	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}
	public abstract void nhapThongTin();
	public abstract double tinhLuong();
	public void inThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Dia Chi: " + diaChi);
		System.out.println("Loai giang vien: " + loaiGiangVien);
		System.out.println("Luong: " + tinhLuong());
	}
	
	

}
