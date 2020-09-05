// Concrete component
public class Pecan extends Pie {
	
	public Pecan() {
		description = "Pecan Pie";
	}
	
	public double cost() {
		Size finalCost = Size.HALF;

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
