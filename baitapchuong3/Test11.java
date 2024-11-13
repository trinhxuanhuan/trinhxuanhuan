package baitapchuong3;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon loai giang vien (1 - GV Co huu, 2 - GV Thinh giang): ");
        int loaiGiangVien = sc.nextInt();
        sc.nextLine();

        if (loaiGiangVien == 1) {
            GVCoHuu gvch = new GVCoHuu();
            System.out.println("Nhập thông tin cho gv cơ hữu: ");// Tạo đối tượng GVCoHuu

            gvch.nhapThongTin();           // Nhập thông tin
            System.out.println("Thong tin cua giang vien co huu la: ");
            gvch.inThongTin();              // In thông tin
        } else if (loaiGiangVien == 2) {
            GVThingGiang gvtg = new GVThingGiang();  // Tạo đối tượng GVThinhGiang
            System.out.println("Nhập thông tin cho giảng viên thỉnh giảng: ");
            gvtg.nhapThongTin();                     // Nhập thông tin
            System.out.println("Thong tin cua giang vien thinh giang la: ");
            gvtg.inThongTin();                       // In thông tin
        } else {
            System.out.println("Lua chon khong hop le. Vui long chon 1 hoac 2.");
        }
    }
}
