package baitapchuong2;

import java.util.Scanner;

public class Bai13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap gia ban va phan tram giam gia
		System.out.print("Nhap gia ban: ");
		double giaBan = sc.nextDouble();
		System.out.print("Nhap phan tram giam gia: ");
		double phanTramGiam = sc.nextDouble();
		//Gia ban sau khi giam
		double soTienGiam = giaBan * (phanTramGiam / 100);
		double giaSauKhiGiam = giaBan - soTienGiam;
		//Hien thi thong tin ra man hinh
		System.out.println("So tien giam la: " + soTienGiam);
		System.out.println("Gia ban sau khi giam la: " + giaSauKhiGiam);
	}
	

}
