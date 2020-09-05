// Concrete component
public class Pecan extends Pie {
	
	public Pecan() {
		description = "Pecan Pie";
	}
	
	public double cost() {
		Size finalCost = getSize();
		double price = 0;

		switch(finalCost) {
			case SLICE:
				return price += 4.99;
			case HALF:
				return price += 6.99;
			case WHOLE:
				return price += 9.99;
		}
		return 0;
	}

}
