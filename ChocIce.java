// Concrete Decorator
public class ChocIce extends CondimentDecorator {
	Pie pie;
	
	public ChocIce(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Chocolate Ice Cream";
	}
	
	public double cost() {
		return pie.cost() + 2.00;
	}

}
