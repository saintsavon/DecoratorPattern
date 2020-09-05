// Concrete Decorator
public class Caramel extends CondimentDecorator {
	Pie pie;
	
	public Caramel(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Caramel";
	}
	
	public double cost() {
		return pie.cost() + 1.75;
	}

}