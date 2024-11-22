package baitapchuong2;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen : ");
		int n = sc.nextInt();
		boolean snt = true;
		if(n < 2) {
			snt = false;
		}else {
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					snt = false;
					break;
				}
			}
		}
		if(snt) {
			System.out.println(n + " La so nguyen to");
		}
		else {
			System.out.println(n + " Khong phai so nguyen to");
		}
	}

}
