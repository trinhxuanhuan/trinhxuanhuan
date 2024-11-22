package baitapchuong2;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so dien cua sinh vien: ");
		int diem = sc.nextInt();
		//Kiem tra diem xep loat
		String xepLoat;
		if(diem >= 90 && diem <= 100) {
			xepLoat = "A";
		}
		else if(diem >= 80) {
			xepLoat = "B";
			
		}
		else if(diem >= 70) {
			xepLoat = "C";
			
		}
		else if(diem >= 50) {
			xepLoat = "D";
		}
		else if(diem >= 0) {
			xepLoat = "F";
		}
		else {
			xepLoat = "Khong hop le!";
		}
		System.out.println("Sinh vien xep loat: " + xepLoat);
		sc.close();
	}

}
