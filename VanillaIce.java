// Concrete Decorator
public class VanillaIce extends CondimentDecorator {
	Pie pie;
	
	public VanillaIce(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Vanilla Ice Cream";
	}
	
	public double cost() {
		return pie.cost() + 2.00;
	}

}
