package baitapchuong2;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap so gio, phut, giay tu ban phim
		System.out.print("Nhap so gio: ");
		int soGio = sc.nextInt();
		System.out.print("Nhap so phut: ");
		int soPhut = sc.nextInt();
		System.out.print("Nhap so giay: ");
		int soGiay = sc.nextInt();
		//Tinh tong so giay
		int tongSoGiay = soGio * 3600 + soPhut * 60 + soGiay;
		System.out.println("Tong so giay la: " + tongSoGiay);
	}

}
