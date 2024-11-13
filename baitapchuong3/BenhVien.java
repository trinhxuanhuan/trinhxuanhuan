package baitapchuong3;

public class BenhVien {
	protected String tenBenhVien;
	protected String diaChi;
	protected String giamDoc;
	
	public BenhVien() {}

	public BenhVien(String tenBenhVien, String diaChi, String giamDoc) {
		super();
		this.tenBenhVien = tenBenhVien;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}

	public String getTenBenhVien() {
		return tenBenhVien;
	}

	public void setTenBenhVien(String tenBenhVien) {
		this.tenBenhVien = tenBenhVien;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}

	@Override
	public String toString() {
		return "BenhVien [tenBenhVien=" + tenBenhVien + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
	
	

}
