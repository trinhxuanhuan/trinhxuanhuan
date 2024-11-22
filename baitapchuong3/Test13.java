package baitapchuong3;

public class Test13 {
	public static void main(String[] args) {
		//khởi tạo đối tượng cho lao động phổ thông
		LaoDongPhoThong ldpt = new LaoDongPhoThong();
		System.out.println("Nhập thông tin cho lao động phổ thông: ");
		//Nhập thông tin cho ldpt
		ldpt.nhapThongTin();
		//In thong tin ldpt ra màn hình
		System.out.println("Thông tin của lao động phổ thông là: ");
		ldpt.inThongTin();
		
		//Khởi tạo đối tượng cho kỹ sư
		KySu ks = new KySu();
		//Nhập thông tin cho kỹ sư
		System.out.println("Nhập thông tin cho kỹ sư: ");
		ks.nhapThongTin();
		//In thông tin kỹ sư ra màn hình
		System.out.println("Thông tin của kỹ sư là: ");
		ks.inThongTin();
	}

}
