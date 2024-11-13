package baitapchuong3;

import java.util.IllformedLocaleException;
import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Nhập bán kính ban đầu: ");
			double radius = sc.nextDouble();
			if(radius <= 0) {
				throw new IllformedLocaleException("Bán kính không thể âm!");
			}
			ResizableCircle resizableCircle = new ResizableCircle(radius);
			System.out.println("Chu vi ban đầu: " + resizableCircle.getPerimeter());
			System.out.println("Diện tích ban đầu: " + resizableCircle.getArea());
			
			System.out.println("Nhập phần trăm thay đổi kích thước: ");
			int percent = sc.nextInt();
			if(percent <= 0) {
				throw new IllegalArgumentException("phần trăm không thể âm!");
			}
			resizableCircle.resiable(percent);
			System.out.println("Bán kính sau khi thay đổi là: " + resizableCircle.radius);
			System.out.println("Chu vi sau khi thay đổi là: " + resizableCircle.getPerimeter());
			System.out.println("Diện tích sau khi thay đổi là: " + resizableCircle.getArea());
			
		} catch(IllegalArgumentException e) {
			System.out.println("Lỗi! " + e.getMessage());
		}
		catch (Exception e) {
	
			System.out.println("Lỗi! Vui lòng nhập lại dữ liệu!");
		}
	}

}
