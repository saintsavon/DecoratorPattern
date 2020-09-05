// Abstract Decorator
public abstract class CondimentDecorator extends Pie {
	public Pie pie;

	public abstract String getDescription();
	public abstract Size getSize();
	
}
