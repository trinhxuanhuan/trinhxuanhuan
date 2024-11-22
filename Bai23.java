package baitapchuong2;

import java.util.Scanner;

public class Bai23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap so luong sinh vien
		System.out.println("Nhap so luong sinh vien: ");
		int n = sc.nextInt();
		int[] diem = new int[n];
		//Nhap diem cho tung sinh vien
		System.out.print("Nhap diem cho tung sinh vien: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap diem cho sinh vien thu: " + (i + 1) );
			diem[i] = sc.nextInt();
			
		}
		
		//Tim diem cao nhat
		int max = diem[0];
		int viTiMax = 0;
		for(int i = 0; i < n; i++) {
			if(diem[i] > max) {
				max = diem[i];
				viTiMax = i;
			}
		}
		System.out.println("Diem cao nhat la: " + max + " (Sinh vien thu: " + (viTiMax + 1) + ")");
		
		//Sap xep diem theo thu tu tang dan
		for(int i = 0; i < n - 1; i++) {
			for(int j = i + 1; j < n; j++) {
				//Hoan doi diem truoc lon hon diem sau
				if(diem[i] > diem[j]) {
					int tg = diem[i];
					diem[i] = diem[j];
					diem[j] = tg;
				}
			}
		}
		//Hien thi ket qua diem sau khi sap xep
		System.out.println("Diem sau khi sap xep theo chieu tang dan la: ");
		for(int i = 0; i < n; i++) {
			System.out.println(diem[i] + " ");
		}
	}

}
