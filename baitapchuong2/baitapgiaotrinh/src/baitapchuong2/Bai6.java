package baitapchuong2;

import java.util.Scanner;

public class Bai6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.print("Nhap so nguyen b: ");
		int b = sc.nextInt();
		//Tinh tong a va b
		int tong = a + b;
		System.out.println("Tong cua 2 so nguyen la: " + tong);
		//Tinh hieu a va b
		int hieu = a - b;
		System.out.println("Hieu cua 2 so nguyen la: " + hieu);
		//Tinh tich a va b
		int tich = a * b;
		System.out.println("Tich cua 2 so nguyen la: " + tich);
		//Tinh thuong a va b
		double thuong = (double)a / b;
		System.out.println("Thuong cua 2 so nguyen la: " + thuong);
	}

}
