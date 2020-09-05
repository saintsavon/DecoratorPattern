// Concrete Decorator
public class Merengue extends CondimentDecorator {
	Pie pie;
	
	public Merengue(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Merengue";
	}
	
	public double cost() {
		return pie.cost() + 1.50;
	}

}