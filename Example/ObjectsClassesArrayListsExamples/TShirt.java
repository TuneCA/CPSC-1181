public class TShirt {
	private String color;
	private ShirtSize size;
	public TShirt(String color, ShirtSize size) {
		this.color = color;
		this.size = size;
	}
	public void shrinkShirt() {
		this.size = size.getSmallerSize();
	}
	public void stretchShirt() {
		this.size = size.getLargerSize();
	}
	public String toString(){
		return "My " + this.color + " shirt is " + this.size;
	}
}
