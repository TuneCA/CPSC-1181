public class Rectangle {

	private int width, length;
	private String color;

	public Rectangle() {
		this.width = 1;
		this.length = 1;
		this.color = "white";
	}

	public Rectangle(int w, int l, String c) {
		if (w<0 || l<0) {
			throw new IllegalArgumentException("Width and length cannot be negative");
		}
		if (c == null) {
			throw new NullPointerException("Color must not be null");
		}
		width = w;
		length = l;
		color = c;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int w) {
		if (w<0) {
			throw new IllegalArgumentException("Width cannot be negative");
		}	
		width = w;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int l) {
		if (l<0) {
			throw new IllegalArgumentException("Length cannot be negative");
		}	
		this.length = l;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color == null) {
			throw new NullPointerException("Color must not be null");
		}		
		this.color = color;
	}

	public int getArea() {
		return this.width * this.length;
	}
	

	public int getPerimeter() {
		return 2*(this.width + this.length);
	}
	
	public boolean isSquare() {
		return (width == length);
	}
	
	public boolean isLargerThan(Rectangle that) {
		if (that == null) {
			throw new NullPointerException("parameter must not be null");
		}		
		int myArea = this.getArea();
		int otherArea = that.getArea();
		return myArea > otherArea;
	}
	
	
	public String toString( ) {
		String result = "Rectangle: ";
		result += "W: " + width + " L: " +length + "  Color: " + color;
		return result;
	}
}
