package pkgShape;

public class Cuboid extends Rectangle implements Comparable<Object> {

	private int iDepth;
	
	public Cuboid (int length, int width, int depth) {
		super(width,length);
		super.setiWidth(width);
		super.setiLength(length);
		this.iDepth = depth;
	}
//jfs 
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		if (iDepth < 0)
			throw new IllegalArgumentException ("Depth must be positive");
		else
			this.iDepth = iDepth;
	}
	
	public double volume() {
		return this.getiLength() * this.getiWidth() * iDepth;
	}
	
	@Override
	public double area() {
		double area1 = 2 * (this.getiLength() * this.getiWidth());
		double area2 = 2 * (this.getiLength() * iDepth);
		double area3 = 2 * (this.getiWidth() * iDepth);
		return area1 + area2 + area3;
	}
	
	public double perimeter() {
		throw new UnsupportedOperationException ("UnsupportedOperationException");
	}
	
	@Override
	public int compareTo(Object cubiod) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public class SortByArea {
		
		public int compareTo(Cuboid cuboid, Cuboid cuboid2) {
			double compareArea = ((Cuboid) cuboid).area();
			double compareArea2 = ((Cuboid) cuboid2).area();
			return(int) (compareArea2 - compareArea);
		}
	}
	
	public class SortByVolume {
		
		public int compareTo(Cuboid cuboid, Cuboid cuboid2) {
			double compareVolume = ((Cuboid) cuboid).volume();
			double compareVolume2 = ((Cuboid) cuboid2).volume();
			return(int) (compareVolume2 - compareVolume);
		}
	}

}
