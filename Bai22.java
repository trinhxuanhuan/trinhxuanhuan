package baitapchuong2;

import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Nhap so luong phan tu
		System.out.print("Nhap so phan tu: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int tong = 0;
		//Nhap cac phan tu trong mang
		System.out.print("Nhap cac phan tu: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			tong += a[i];
			
			
		}
		//Hien thi tong tinh duoc ra man hinh
		System.out.println("Tong cua cac so trong mang la: " + tong);
	}

}
