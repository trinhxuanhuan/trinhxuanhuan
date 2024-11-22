package baitapchuong2;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Nhập n từ bàn phím
		System.out.println("Nhập vào 1 số nguyên n: ");
		int n = sc.nextInt();
		//Kiểm tra điều kiện
		if(n < 0) {
			System.out.println("Không có giai thưaf cho số âm");
		}
		else {
			//Tính giai thừa
			long gt = 1;
			for(int i = 1; i <= n; i++) {
				gt *= i;
				
			}
			//Hiển thị kết quả ra màn hình
			System.out.println("Giai thừa của số nguyên: " + n + " là: " + gt);
		}
		sc.close();
	}

}
