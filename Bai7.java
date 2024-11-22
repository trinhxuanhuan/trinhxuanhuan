package baitapchuong2;

import java.util.Scanner;

public class Bai7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap vao 2 so thuc
		System.out.print("Nhap so thuc a: ");
		double a = sc.nextDouble();
		System.out.print("Nhap so thuc b: ");
		double b = sc.nextDouble();
		//Nhap vao mot ky tu
		System.out.println("Nhap vao mot ky tu (A/S/M/D): ");
		char kyTu = sc.next().charAt(0);
		switch (kyTu) {
		case 'A': {
			System.out.println("Ket qua cua phep cong la: " + (a + b));
			break;
		}
		case 'S' : {
			System.out.println("Ket qua cua phep tru la: " + (a - b));
			break;
		}
		case 'M' : {
			System.out.println("Ket qua cua phep nhan la: " + (a * b));
			break;
		}
		case 'D' : {
			if(b != 0) {
				System.out.println("Ket qua cua phep chia la: " + (a / b));
			}
			else {
				System.out.println("Khong the chia cho 0!");
			}
			break;
			}
		default: 
			System.out.println("Ky tu khong hop le!");
			break;

		
		}
		
	}

}
