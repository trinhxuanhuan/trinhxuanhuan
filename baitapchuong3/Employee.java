package baitapchuong3;

import java.util.Scanner;

public class Employee extends Person6 {
	protected String employeeName;
	protected String dateHired;
	public Employee() {}
	

	public Employee(String employeeName, String dateHired) {
		super();
		this.employeeName = employeeName;
		this.dateHired = dateHired;
	}
	


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDateHired() {
		return dateHired;
	}


	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}


	@Override
	public void nhapTT() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập tuổi: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập giới tính(N-Nam, F-Nữ): ");
		gender = sc.next().charAt(0);
		System.out.println("Nhập employeeName: ");
		employeeName = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập dateHired: ");
		dateHired = sc.nextLine();
		
	}


	@Override
	public String toString() {
		return super.toString() + "Employee [employeeName=" + employeeName + ", dateHired=" + dateHired + "]";
	}
	

}
