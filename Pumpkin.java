// Concrete component
public class Pumpkin extends Pie {
	
	public Pumpkin() {
		description = "Pumpkin Pie";
	}
	
	public double cost() {
		Size finalCost = getSize();

		switch(finalCost) {
			case SLICE:
				return 4.99;
			case HALF:
				return 7.49;
			case WHOLE:
				return 9.99;
		}
		return 0;
	}

}