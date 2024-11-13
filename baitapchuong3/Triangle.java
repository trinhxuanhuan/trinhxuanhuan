package baitapchuong3;

import java.util.Scanner;

public class Triangle extends Shape{

	private int base;
	private int height;
	public Triangle(){}
	

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	
	public void nhapThongTin() {
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("Nhap mau sac tam giac: ");
				color = sc.nextLine();
				if (!color.matches("[a-zA-Z]+")) {
					throw new IllegalArgumentException("Mau sac phai la chu cai va khong duoc rong."); }
				System.out.println("Nhap canh day cua tam giac: ");
				base = sc.nextInt();
				sc.nextLine();
				System.out.println("Nhap chieu cao cua tam giac: ");
				height = sc.nextInt();
				sc.nextLine();
				if(base > 0 && height > 0) {
					break;
				}
				else {
					System.out.println("Chieu cao va canh day phai lon hon 0!");
				}
			}
			
		} catch (IllegalArgumentException e) { System.out.println("LOI: " + e.getMessage()); 

		}
		catch (Exception e) {
			System.out.println("LOI! Vui long nhap lai!");
		}
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	@Override
	public String toString() {
		
		return "Thongg tin Hinh tam giac: " + "Mau sac: "  + color + ", " + "base: " + base + ",  " + "height: "  + height +"," + "Dien tich: " + getArea();
	}






}
