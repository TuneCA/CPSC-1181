
public enum ShirtSize {
	XSMALL("x-small"), SMALL("small"), MEDIUM("medium"), LARGE("large"), XLARGE("x-large");
	
	private String displayText;
	
	private ShirtSize(String text) {
		this.displayText = text;
	}
	
	public String toString() {
		return this.displayText;
	}
	
	public ShirtSize getSmallerSize(){
		switch(this){
		case XSMALL: return null;
		case SMALL: return XSMALL;
		case MEDIUM: return SMALL;
		case LARGE: return MEDIUM;
		case XLARGE: return LARGE;
		default: return null;
		}
	}
	
	public ShirtSize getLargerSize(){
		switch(this){
		case XSMALL: return SMALL;
		case SMALL: return MEDIUM;
		case MEDIUM: return LARGE;
		case LARGE: return XLARGE;
		case XLARGE: return null;
		default: return null;
		}
	}
}
