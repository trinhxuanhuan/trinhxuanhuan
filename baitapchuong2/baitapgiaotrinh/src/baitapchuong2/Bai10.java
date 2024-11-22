package baitapchuong2;

import java.util.Scanner;

public class Bai10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap 2 canh hinh chu nhat
		System.out.print("Nhap chieu dai: ");
		float cd = sc.nextFloat();
		System.out.print("Nhap chieu rong: ");
		float cr = sc.nextFloat();
		//Tinh chu vi va dien tich hinh chu nhat
		float chuVi = 2 * (cd * cr);
		System.out.println("Chu vi cua hinh chu nhat la: " + chuVi);
		float dienTich = cd * cr;
		System.out.println("Dien tich cua hinh chu nhat la: " + dienTich);
	}

}
