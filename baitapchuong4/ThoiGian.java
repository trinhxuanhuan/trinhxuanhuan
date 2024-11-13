package baitapchuong4;

import java.util.Scanner;

public class ThoiGian {
	private int ngay;
	private int thang;
	private int nam;
	public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
		if(ngay <= 0 || thang <= 0 || thang > 12 || nam <= 0) {
			throw new InvalidDateException("Ngày, Tháng, năm không hợp lệ");
		}
		if(ngay > 31 || (thang == 2 && ngay > 29)) {
			throw new InvalidDateException("Ngày không hợp lệ trong tháng");
		}
		
		this.ngay = ngay;
		this.thang = thang;
		this.nam = nam;
	}
	
	public String toString() {
		return "ThoiGian [ngay=" + ngay + ", thang=" + thang + ", nam=" + nam + "]";
	}
	
	

}
		


