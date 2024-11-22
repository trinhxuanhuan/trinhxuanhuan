package baitapchuong3;

public class Test14 {
	public static void main(String[] args) {
		//Khởi tạo đối tượng CNKSP
		CNKSP cnksp = new CNKSP();
		//Nhập thông tin cho công nhân khoán sp
		System.out.println("Nhập thông tin cho CNKSP: ");
		cnksp.nhapThongTin();
		//In thông tin cho CNKSP
		System.out.println("Thông tin của CNKSP là: ");
		cnksp.inThongTin();
		
		//Khởi tạo đối tượng cho CNTCN
		CNTCN cntcn = new CNTCN();
		//Nhập thông tin cho CNTCN
		System.out.println("Nhập thông tin cho CNTCN: ");
		cntcn.nhapThongTin();
		//In thông tin cho CNTCN
		System.out.println("Thông tin của CNTCN là: ");
		cntcn.inThongTin();
		
		
	}

}
