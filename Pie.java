// Decorator attempt, maybe a pie?
// Figure out how to use Git with Eclipse

// Abstract component
public abstract class Pie {
	public enum Size {SLICE, HALF, WHOLE};
	Size size = Size.SLICE;

	String description = "Unknown Pie";
	
	public String getDescription() {
		return description;
	}
	
	public void setSize(Size size) {
		this.size = size;
	}
	
	public Size getSize() {
		return this.size;
	}
	
	public abstract double cost();
	
}