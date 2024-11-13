package baitapchuong3;

public class Test3 {
	public static void main(String[] args) {
		NhanVien nv = new NhanVien();
		nv.nhapThongTinNV();
		System.out.println("Thông tin của nhân viên là: " + nv);
		
		System.out.println("Tên: " + nv.getName());
		System.out.println("Địa chỉ: " + nv.getAddress());
		System.out.println("Ngày sinh: " + nv.getDob());
		System.out.println("Giới tính: " + nv.getGender());
	}

}
