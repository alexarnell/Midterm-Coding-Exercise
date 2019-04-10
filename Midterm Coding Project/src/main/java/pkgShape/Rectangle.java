package pkgShape;

public class Rectangle extends Shape implements Comparable<Object>{
	
	private int iWidth;
	private int iLength;
	
	public Rectangle(int width, int length) {
		this.iWidth = width;
		this.iLength = length;
	}
	
	public int getiWidth() {
		return iWidth;
	}	
	
	public void setiWidth(int width) {
		if (width < 0)
		    throw new IllegalArgumentException("Width must be positive");
		else
			iWidth = width;
	}
	
	public int getiLength() {
		return iLength;
	}
	
	public void setiLength(int length) {
		if (length < 0)
		    throw new IllegalArgumentException("Length must be positive");
		else
			iLength = length;
	}
	
	@Override
	public double area() {
		return iLength * iWidth;
	}
	@Override
	public double perimeter() {
		return (iLength * 2) + (iWidth * 2);
	}
	
	public int compareTo(Object rectangle) {
		double compareArea = ((Rectangle) rectangle).area();
		return(int) (this.area() - compareArea);
	}

	
}