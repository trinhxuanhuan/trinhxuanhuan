package baitapchuong2;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap so ngay va don gia
		System.out.print("Nhap so ngay luu tru: ");
		double soNgay = sc.nextDouble();
		System.out.print("Nhap don gia: ");
		double donGia = sc.nextDouble();
		double soTienGiam;
		
		if(soNgay == 1) {
			donGia = donGia;
		}
		else if(soNgay <= 4) {
			soTienGiam = donGia * 0.2;
			donGia = donGia - soTienGiam;
			
		}
		else if(soNgay <= 10 ) {
			soTienGiam = donGia * 0.4;
			donGia = donGia - soTienGiam;
		}
		else if(soNgay >= 11) {
			soTienGiam = donGia * 0.6;
			donGia = donGia - soTienGiam;
		}
		System.out.println("So tien phai tra la: " + donGia);
		
	}

}
