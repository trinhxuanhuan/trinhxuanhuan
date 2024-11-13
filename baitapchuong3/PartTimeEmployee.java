package baitapchuong3;

import java.util.Scanner;

public class PartTimeEmployee extends Employee{
	private int hoursPerWeek;
	public PartTimeEmployee() {}
	public PartTimeEmployee(int hoursPerWeek) {
		super();
		this.hoursPerWeek = hoursPerWeek;
	}
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public void nhapTT() {
		super.nhapTT();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số giờ làm việc trong tuần");
		hoursPerWeek = sc.nextInt();
	}
	@Override
	public String toString() {
		return super.toString() + "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + "]";
	}
	

}
