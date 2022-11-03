package studio7;

public class Rectangle {

	private int length;
	private int width;
	
	public Rectangle(int initLength, int initWidth) {
		length = initLength;
		width = initWidth;
		
	}
	public int area() {
		int area = length * width;
		return area;
	}
	public int perimeter() {
		int perimeter = (2*length)+(2*width);
		return perimeter;
	}
	public boolean isSquare() {
		if(length==width) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle newRec = new Rectangle(3,4);
		System.out.println(newRec.area());
		System.out.println(newRec.perimeter());
		System.out.println(newRec.isSquare());
	}

}
