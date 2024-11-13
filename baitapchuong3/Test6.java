package baitapchuong3;

public class Test6 {
	public static void main(String[] args) {
		PartTimeEmployee pte = new PartTimeEmployee();
		System.out.println("Nhập thông tin cho nhân viên partime: ");
		pte.nhapTT();
		System.out.println("Tên: " + pte.getName());
		System.out.println("Tuổi: " + pte.getAge());
		System.out.println("Giới tính: " + pte.getGender());
		System.out.println("employeeName: " + pte.getEmployeeName());
		System.out.println("dateHired: " + pte.getDateHired());
		System.out.println("hoursPerweek: " + pte.getHoursPerWeek());
		System.out.println("Thông tin của đối tượng là: ");
		System.out.println(pte.toString());
	}

}
