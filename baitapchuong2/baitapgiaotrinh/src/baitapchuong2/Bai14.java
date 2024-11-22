package baitapchuong2;

import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhap so dien tieu thu
		System.out.print("NHap so dien tieu thu: ");
		int soDien = sc.nextInt();
		
		int soTienDien = 0;
		if(soDien <= 50) {
			soTienDien = soDien * 1484;
		}
		else if(soDien <= 100) {
			soTienDien = (50 * 1484) + ((soDien - 50) * 1533);
		}
		else if(soDien <= 200) {
			soTienDien = (50 * 1484) + (100 * 1533) + ((soDien - 100) * 1786);
		}
		else if(soDien >= 201) {
			soTienDien = (50 * 1484) + (100 * 1533) + (200 * 1786) + ((soDien - 200) * 2242);
		}
		System.out.println("So tien dien phai tra la: " + soTienDien + " VND");
	}

}
