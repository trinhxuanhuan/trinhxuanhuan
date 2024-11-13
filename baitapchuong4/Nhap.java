package baitapchuong4;

import java.util.Scanner;
public class Nhap {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = 0, b = 0;
			try {
				System.out.println("Nhập số nguyên a: ");
				a = sc.nextInt();
				System.out.println("Nhập số nguyên b: ");
				b = sc.nextInt();
				double kq = (double)a / b;
				System.out.println("Kết quả của phép chia 2 số nguyên là: " + kq);
			   }catch (ArithmeticException e) {
					System.out.println("Không thể chia cho số 0");
				} catch (Exception e) {
				System.out.println("Lỗi! Phép toán không thể thực hiện");
			}
			finally {
				System.out.println("finally");
			}
		}

	}


