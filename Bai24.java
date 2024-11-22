package baitapchuong2;

import java.util.Scanner;

public class Bai24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap so luong sinh vien
		System.out.print("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		int[] diem = new int[n];
		
		//Nhap diem cho tung sinh vien
		System.out.println("Nhap diem cho tung sinh vien");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap diem cho sinh vien thu: " + (i + 1) );
			diem[i] = sc.nextInt();
			
		}
		//Nhap diem can tim
		System.out.print("Nhap diem can tim: ");
		int diemCanTim = sc.nextInt();
		boolean tim = false;
		for(int i = 0; i < n; i++) {
			if(diem[i] == diemCanTim) {
				System.out.println("Sinh vien co diem: " + diemCanTim + " tai vi tri " + (i + 1));
				tim = true;
			}
		}
		if(!tim) {
			System.out.println("Khong co sinh vien vien nao co diem: " + diemCanTim);
		}
		
	}

}
