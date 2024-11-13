package baitapchuong3;

public class Test5 {
	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.nhapThongTinhSV();
		System.out.println("Thông tin sinh viên là: " + sv);
		//Kiểm tra getter và setert
		System.out.println("Tên sinh viên: " + sv.getTen());
		System.out.println("Tuổi: " + sv.getTuoi());
		System.out.println("Giới tính: " + sv.getGioiTinh());
		System.out.println("Lớp: " + sv.getLop());
		System.out.println("Ngành: " + sv.getNganh());
		System.out.println("Trường: " + sv.getTruong());
		sv.setLop("KTPM01");
		System.out.println("Thông tin mới của sinh viên là: " + sv);
	}

}
