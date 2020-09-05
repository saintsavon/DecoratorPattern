// Concrete component
public class Pumpkin extends Pie {
	
	public Pumpkin() {
		description = "Pumpkin Pie";
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