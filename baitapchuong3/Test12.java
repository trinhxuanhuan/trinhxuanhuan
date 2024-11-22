package baitapchuong3;

public class Test12 {
	public static void main(String[] args) {
		SVCDN svcdn = new SVCDN(); //Khoi tao doi tuong cho svcdn
		System.out.println("Nhap thong tin cho sinh vien cao dang nghe: ");
		svcdn.nhapThongTin(); //Nhap thong tin
		System.out.println("Thong tin cua sinh vien cao dang nghe la: ");
		svcdn.inThongTin(); //In thong tin
		
		SVCDCQ svcdcq = new SVCDCQ(); //Khoi tao doi tuong cho svcdcq
		System.out.println("Nhap thong tin cho sinh vien cao dang chinh quy: ");
		svcdcq.nhapThongTin(); //Nhap thong tin
		System.out.println("Thong tin cua sinh vien cao dang chinh quy la: ");
		svcdcq.inThongTin(); //In thong tin
		
		
	}

}
