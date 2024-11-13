package baitapchuong4;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chuoiKyTu;
		while(true) {
			System.out.println("Nhập chuỗi ký tự(Hoặc nhập DONE để kết thúc chương trình): ");
			chuoiKyTu = sc.nextLine();
			if(chuoiKyTu.equals("DONE")) {
				System.out.println("Kết thúc chương trình");
				break;
			}

		try {
			if(chuoiKyTu.length() > 20) {
				throw new StringTooLongException("LỖI! Chuỗi ký tự đã vượt quá 20 ký tự");
			}
			System.out.println("Chuỗi ký tự là: " + chuoiKyTu);
			
		} catch (StringTooLongException e) {
			System.out.println(e.getMessage());
			
		}
		}
	}

}
