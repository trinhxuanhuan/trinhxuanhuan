package baitapchuong3;

public class Test4 {
	public static void main(String[] args) {
		BenhNhan bn = new BenhNhan();
		bn.nhapThongTinBN();
		System.out.println("Thông tin bệnh nhân là: " + bn);
		//kiểm tra getter và setter
		System.out.println("Tên bệnh nhân: " + bn.getTen());
		System.out.println("Tuổi bệnh nhân: " + bn.getTuoi());
		System.out.println("Giới tính: " + bn.getGioiTinh());
		System.out.println("Tiền sử: " + bn.getTienSu());
		System.out.println("Chẩn đoán: " + bn.getChanDoan());
		System.out.println("Tên bệnh viện: " + bn.getBenhVien());
		bn.setChanDoan("Sâu Răng");
		System.out.println("Thông tin sau khi sửa là: " + bn);

	}

}
