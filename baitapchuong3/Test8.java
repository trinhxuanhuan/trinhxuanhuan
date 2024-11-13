package baitapchuong3;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
       Rectangle rect = new Rectangle();
       rect.nhapThongTin();
       rect.getArea();
       System.out.println("Thong tin cua hinh chu nhat la: " + rect);
       
       Triangle tri = new Triangle();
       tri.nhapThongTin();
       tri.getArea();
       System.out.println("Thong tin cua hinh tam giac la: " + tri);
	}

}
