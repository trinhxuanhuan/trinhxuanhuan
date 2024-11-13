package baitapchuong3;

public class Test2 {
	public static void main(String[] args) {
		DiaChi dc = new DiaChi();
		dc.nhapThongTinDiaChi();
		System.out.println("Thông tin địa chỉ là: " + dc);
		//Kiểm tra getter
		System.out.println("Tên thôn: " + dc.getThon());
		System.out.println("Tên xã: " + dc.getXa());
		System.out.println("Tên huyện: " + dc.getHuyen());
		System.out.println("Tên tỉnh: " + dc.getTinh());
	}

}
