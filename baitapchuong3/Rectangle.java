package baitapchuong3;

import java.util.Scanner;

public class Rectangle extends Shape {
	private int length;
	private int width;
	public Rectangle() {}
	

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		try {
			
			while(true) {
			System.out.println("Nhap thong tin mau sac HCN: ");
			color = sc.nextLine();
			if (!color.matches("[a-zA-Z]+")) { 
				throw new IllegalArgumentException("Mau sac phai la chu cai va khong duoc rong."); 
				}
			System.out.println("Nhap chieu dai HCN: ");
			length = sc.nextInt();
			sc.nextLine();
			System.out.println("Nhap chieu rong HCN: ");
			width = sc.nextInt();
			sc.nextLine();
			if(length > 0 && width > 0) {
				break;
			}
			else {
				System.out.println("Loi! Chieu dai va chieu rong khong hop le!");
			}
			}
			

	        }catch (IllegalArgumentException e) { 
		    System.out.println("LOI: " + e.getMessage()); 
	
		    }catch (Exception e) {
			System.out.println("LOI! Thong tin khong hop le! ");
		}
	

	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

	@Override
	public String toString() {
		
		return "Thong tin hinh chu nhat: " + "Mau sac: " + color + ",  " + "length: " + length + ", " + "width: " + width + ", " + "Dien tich: " + getArea();
	}

}
