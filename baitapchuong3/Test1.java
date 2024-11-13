package baitapchuong3;

public class Test1 {
	public static void main(String[] args) {
		Person ps = new Person();
		ps.nhapThongTin();
		System.out.println("Thông tin là: " + ps);
		//Kiểm tra phương thức getter
		System.out.println("Tên: " + ps.getName());
		System.out.println("Ngày sinh: " + ps.getDob());
		System.out.println("Nơi sinh: " + ps.getPob());
		System.out.println("Giới tính: " + ps.getGender());
		System.out.println("Email: " + ps.getEmail());
		System.out.println("SDT: " + ps.getPhone());
		ps.setPhone("07777");
		System.out.println("Thông tin mới là: " + ps);
		

		
	}

}
