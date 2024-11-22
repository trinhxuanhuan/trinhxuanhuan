package baitapchuong2;

import java.util.Scanner;

public class Bai5 {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				// Nhập vào một số nguyên
			    System.out.print("Nhập vào một số nguyên: ");
			    int a = sc.nextInt();

			    // Nhập vào một số thực
			    System.out.print("Nhập vào một số thực: ");
			    float b = sc.nextFloat();

			    // Nhập vào một ký tự
			    System.out.print("Nhập vào một ký tự: ");
			    char c = sc.next().charAt(0);

			    // Nhập vào một chuỗi ký tự
			    System.out.print("Nhập vào một chuỗi ký tự: ");
			    sc.nextLine(); // Đọc dấu enter trong bộ đệm
			    String chuoi = sc.nextLine();

			    // Hiển thị các thông tin 
			    System.out.println("Số nguyên: " + a);
			    System.out.println("Số thực: " + b);
			    System.out.println("Ký tự: " + c);
			    System.out.println("Chuỗi ký tự: " + chuoi);

			    sc.close();
			}

	}


