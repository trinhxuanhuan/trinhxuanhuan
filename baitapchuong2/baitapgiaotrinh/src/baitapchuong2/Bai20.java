package baitapchuong2;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap thong tin tu ban phim
		System.out.print("Nhap nhiet do: ");
		double doC = sc.nextDouble();
		//Tinh nhiet do theo F
		double F = doC * 1.8 + 32;
		System.out.println("Nhiet do o do F la: " + F);
	}

}
