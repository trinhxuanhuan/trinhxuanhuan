package baitapchuong2;

import java.util.Scanner;

public class Bai11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("NHap vao ban kinh cua 1 hinh tron: ");
		float bk = sc.nextFloat();
		//Tinh va hien thu=i chu vi, dien tich cua hinh tron
		float chuVi = (float) (2 * Math.PI * bk);
		System.out.println("Chu vi cua hinh tron la: " + chuVi);
		float dienTich = (float) (Math.PI * bk * bk);
		System.out.println("Dien tich cua hinh tron la: " + dienTich);
	}

}
