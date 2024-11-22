package baitapchuong3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SVCDCQ extends Nguoi_b12 {
	private double tongDiemCacMon;
	private int soMonKiemTra;
	private double diemThiKTHP;
	
	public SVCDCQ() {}
	

	public SVCDCQ(double tongDiemCacMon, int soMonKiemTra) {
		super();
		this.tongDiemCacMon = tongDiemCacMon;
		this.soMonKiemTra = soMonKiemTra;
	}
	public void nhapThongTin() {
		super.nhapThongTin();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap tong diem cac mon kiem tra: ");
			tongDiemCacMon = sc.nextDouble();
			System.out.print("Nhap so mon kiem tra: ");
			soMonKiemTra = sc.nextInt();
			sc.nextLine();
			System.out.print("Nhap diem thi KTHP:  ");
			diemThiKTHP = sc.nextDouble();
			if(tongDiemCacMon < 0 || soMonKiemTra < 0 || diemThiKTHP < 0) {
				throw new InputMismatchException("Cac mon kiem tra va tong diem khong the am");
			}
			
		} catch (InputMismatchException e) {
			System.out.println("Loi!" + e.getMessage() + "Vui long nhap lai");
			nhapThongTin();
		}
	}
	
        public double tinhDiem() {
		return (tongDiemCacMon / soMonKiemTra + diemThiKTHP)/3;
	}

}
