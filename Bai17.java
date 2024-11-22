package baitapchuong2;

public class Bai17 {
	public static void main(String[] args) {
		for(int i = 100; i <= 999; i++) {
			int a = i / 100; // chu so hang tram
			int b = (i / 10) % 10; //Chu so hang chuc
			int c = i % 10; // Chu so hang don vi
			if(i == a * a * a + b * b * b + c * c * c ) {
				System.out.println(i);
			}
		}
	}

}
