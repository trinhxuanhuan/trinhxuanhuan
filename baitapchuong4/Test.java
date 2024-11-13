package baitapchuong4;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws InvalidDateException {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhập ngày: ");
			int ngay = sc.nextInt();
			System.out.println("Nhập tháng: ");
			int thang = sc.nextInt();
			System.out.println("Nhập năm: ");
			int nam = sc.nextInt();
			ThoiGian tg = new ThoiGian(ngay, thang, nam);
			System.out.println("Thời gian hợp lệ " + tg);
			
		} catch (InvalidDateException e){
			System.out.println("Lỗi " + e.getMessage());
			
		} catch (Exception e) {
			System.out.println("Lỗi! Vui lòng nhập lại");
		}
		finally {
			System.out.println("Finally");
		}

	}

}
