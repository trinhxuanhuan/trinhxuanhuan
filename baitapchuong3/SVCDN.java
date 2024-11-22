package baitapchuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SVCDN extends Nguoi_b12 {
	private double tongDiemCacMonKiemTra;
	private int soMonKiemTra;
	
	public SVCDN() {}
	

	public SVCDN(double tongDiemCacMonKiemTra, int soMonKiemTra) {
		super();
		this.tongDiemCacMonKiemTra = tongDiemCacMonKiemTra;
		this.soMonKiemTra = soMonKiemTra;
	}


	@Override
	public double tinhDiem() {
		return tongDiemCacMonKiemTra/ soMonKiemTra;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap tong diem cac mon kiem tra: ");
			tongDiemCacMonKiemTra = sc.nextDouble();
			System.out.println("Nhap so mon kiem tra: ");
			soMonKiemTra = sc.nextInt();
			sc.nextLine();
			if(tongDiemCacMonKiemTra < 0 || soMonKiemTra < 0) {
				throw new InputMismatchException("Cac mon kiem tra va tong diem khong the am");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Loi!" + e.getMessage() + "Vui long nhap lai");
			nhapThongTin();
		}
	}
		
	public void inThongTin() {
		super.inThongTin();
		System.out.println("Tong diem cac mon: " + tongDiemCacMonKiemTra);
		System.out.println("So mon kiem tra: " + soMonKiemTra);
	}


}
