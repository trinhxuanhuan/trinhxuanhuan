package baitapchuong3;

import java.io.IOException;
import java.nio.CharBuffer;

public class ResizableCircle extends Circle implements Readable  {
	public ResizableCircle(double radius) {
		super(radius);
	}
	public void resiable(int percent) {
		radius *= (1 + percent / 100.0);
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
