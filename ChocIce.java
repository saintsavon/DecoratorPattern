// Concrete Decorator
public class ChocIce extends CondimentDecorator {
	Pie pie;
	
	public ChocIce(final Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Chocolate Ice Cream";
	}
	
	public double cost() {
		if (size == Size.SLICE) {
			return pie.cost() + 2.00;
		}

		else if (size == Size.HALF) {
			return pie.cost() + 3.00;
		}

		else if (size == Size.WHOLE) {
			return pie.cost() + 4.00;
		}

		else {
			return 0;
		}

	}

}
