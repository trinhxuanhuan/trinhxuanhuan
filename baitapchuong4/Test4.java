package baitapchuong4;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double luong = 0;
		try {
			System.out.println("Nhập lương: ");
			luong = sc.nextDouble();
			if(luong < 5000000 || luong > 20000000) {
				throw new OutOfRangeException("Lỗi! Yêu cầu nhập lại");
			}
			System.out.println("Số lương là: " + luong);
			
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Lỗi! Dữ liệu không hợp lệ");
		}
		finally {
			sc.close();
		}
		
	}

}
