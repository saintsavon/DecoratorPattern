// Concrete Decorator
public class ChocIce extends CondimentDecorator {
	Pie pie;
	
	public ChocIce(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Chocolate Ice Cream";
	}
	
	public Size getSize() {
		return this.pie.getSize();
	}

	public double cost() {
		double cost = pie.cost();

		if (pie.getSize() == Size.SLICE) {
			cost += 1.00;
		} else if (pie.getSize() == Size.HALF) {
			cost += 2.00;
		} else if (pie.getSize() == Size.WHOLE) {
			cost += 3.00;
		}
		else {
			return 0;
		}

		return cost;
	}

}
