// Concrete Decorator
public class Merengue extends CondimentDecorator {
	Pie pie;
	
	public Merengue(Pie pie) {
		this.pie = pie;
	}
	
	public String getDescription() {
		return pie.getDescription() + ", Merengue";
    }
    
    public Size getSize() {
		return this.pie.getSize();
	}
	
	public double cost() {
        double cost = pie.cost();

		if (pie.getSize() == Size.SLICE) {
			cost += 0.50;
		} else if (pie.getSize() == Size.HALF) {
			cost += 0.75;
		} else if (pie.getSize() == Size.WHOLE) {
			cost += 1.00;
		}
		else {
			return 0;
		}

		return cost;
	}


}