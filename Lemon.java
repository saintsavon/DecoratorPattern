// Concrete component
public class Lemon extends Pie {
	
	public Lemon() {
		description = "Lemon Pie";
	}
	
	public double cost() {
		Size finalCost = getSize();
		double price = 0;

		switch(finalCost) {
			case SLICE:
				return price += 3.49;
			case HALF:
				return price += 5.49;
			case WHOLE:
				return price += 7.49;
		}
		return 0;
	}

}
