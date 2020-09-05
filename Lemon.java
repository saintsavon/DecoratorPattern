// Concrete component
public class Lemon extends Pie {
	
	public Lemon() {
		description = "Lemon Pie";
	}
	
	public double cost() {
		Size finalCost = getSize();

		switch(finalCost) {
			case SLICE:
				return 3.49;
			case HALF:
				return 5.49;
			case WHOLE:
				return 7.49;
		}
		return 0;
	}

}
