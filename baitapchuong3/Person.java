package baitapchuong3;

import java.util.Scanner;

public class Person {
	private String name;
	private String dob;
	private String pob;
	private char gender;
	private String email;
	private String phone;
	public Person() {}
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPob() {
		return pob;
	}
	public void setPob(String pob) {
		this.pob = pob;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		System.out.println("Nhập Ngày sinh: ");
		dob = sc.nextLine();
		System.out.println("Nhập nơi sinh: ");
		pob = sc.nextLine();
		System.out.println("Nhập giới tính(M - nam, F- nữ): ");
		gender = sc.next().charAt(0);
		sc.nextLine();
		System.out.println("Nhập email: ");
		email = sc.nextLine();
		System.out.println("Nhập SDT: ");
		phone = sc.nextLine();
		
	}
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", pob=" + pob + ", gender=" + gender + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	
	

}
