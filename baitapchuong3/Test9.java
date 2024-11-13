package baitapchuong3;

public class Test9 {
	public static void main(String[] args) {
	       Shape[] shapes = new Shape[5];

	        shapes[0] = new Rectangle();
	        shapes[0].nhapThongTin();

	        shapes[1] = new Triangle();
	        shapes[1].nhapThongTin();

	        shapes[2] = new Rectangle();
	        shapes[2].nhapThongTin();

	        System.out.println("\nThong tin cac hinh:");
	        for (Shape shape : shapes) {
	            if (shape instanceof Rectangle) {
	                System.out.println(shape);
	            }
	            for (Shape shape2 : shapes) {
	            	if(shape instanceof Triangle)
	            	System.out.println(shape);
					
				}
	        }
	    }

	}


