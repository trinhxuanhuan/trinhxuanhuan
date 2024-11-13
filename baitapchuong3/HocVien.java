package baitapchuong3;

public abstract class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected String loatChuongTrinh;
	protected int loaiUuTien;
	protected double hocPhi;

	
	public HocVien() {}


	public HocVien(String hoTen, String diaChi, String loatChuongTrinh, int loaiUuTien, double hocPhi) {
		super();
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loatChuongTrinh = loatChuongTrinh;
		this.loaiUuTien = loaiUuTien;
		this.hocPhi = hocPhi;
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


	public String getLoatChuongTrinh() {
		return loatChuongTrinh;
	}


	public void setLoatChuongTrinh(String loatChuongTrinh) {
		this.loatChuongTrinh = loatChuongTrinh;
	}


	public int getLoaiUuTien() {
		return loaiUuTien;
	}


	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}


	public double getHocPhi() {
		return hocPhi;
	}


	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}
	public abstract double tinhHocPhi();
	public abstract void nhapThongTin();
    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ưu tiên: " + (loaiUuTien == 1 ? "Loại 1" : "Loại 2"));
        System.out.println("Học phí: " + tinhHocPhi() + " VND");
    }


	@Override
	public String toString() {
		return "HocVien [hoTen=" + hoTen + ", diaChi=" + diaChi + ", loatChuongTrinh=" + loatChuongTrinh
				+ ", loaiUuTien=" + loaiUuTien + ", hocPhi=" + hocPhi + "]";
	}
	
	



	
	


}
