// Concrete Decorator
public class Whip extends CondimentDecorator {
	Pie pie;
	
	public Whip(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Whip";
	}
	
	public double cost() {
		return pie.cost() + .50;
	}
}
