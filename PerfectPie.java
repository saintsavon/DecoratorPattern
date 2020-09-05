// Test Code 

//import Pie.Size;

public class PerfectPie extends Pie {

	public static void main(String[] args) {
		Pie pie = new Apple();
		pie.setSize(Size.SLICE);
		pie = new Whip(pie);
		pie = new ChocIce(pie);
		System.out.println(pie.getDescription() + " $" + String.format("%.2f", pie.cost()));

		Pie pie2 = new Pecan();
		pie2.setSize(Size.SLICE);
		pie2 = new VanillaIce(pie2);
		pie2 = new Whip(pie2);
		System.out.println(pie2.getDescription() + " $" + String.format("%.2f", pie2.cost()));
		
		Pie pie3 = new Pumpkin();
		pie3.setSize(Size.WHOLE);
		pie3 = new Whip(pie3);
		System.out.println(pie3.getDescription() + " $" + String.format("%.2f", pie3.cost()));

		Pie pie4 = new Lemon();
		pie4.setSize(Size.HALF);
		pie4 = new Merengue(pie4);
		System.out.println(pie4.getDescription() + " $" + String.format("%.2f", pie4.cost()));

	}

	@Override
	public double cost() {
		return 0;
	}

}
