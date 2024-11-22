package baitapchuong2;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu: ");
		//Nhap so luong phan tu trong mang
		int n = sc.nextInt();
		int[] a = new int[n];
		
		//Nhap cac phan tu cua mang
		System.out.println("Nhap cac phan tu: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		//Hien thi cac phan tu trong mang
			System.out.print( a[i] + " ");
			
		}
		
	}

}
