// Test Code 

//import Pie.Size;

public class PerfectPie extends Pie {

	public static void main(String[] args) {
		Pie pie = new Apple();
		pie.setSize(Size.SLICE);
		System.out.println(pie.getDescription() + " $" + pie.cost());

		Pie pie2 = new Pecan();
		pie2 = new VanillaIce(pie2);
		pie2 = new Whip(pie2);
		System.out.println(pie2.getDescription() + " $" + pie2.cost());
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0;
	}

}
