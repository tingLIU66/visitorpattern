package main;
//Khin Si | COMP 373 Project 4
public class CartVisitorImp implements CartVisitorInterface
{

	@Override
	public double visit(Vegetable vegetable) {
		double total = vegetable.getPrice() * .25;
		total = Math.round(total* 100.0)/100.0;
		System.out.println("Vegetable:"+ vegetable.getName() + ", Total Cost With Tax = $" + total);
		// TODO Auto-generated method stub
		return total;
	}

	@Override
	public double visit(Cosmetic cosmetic) {
		double total = cosmetic.getPrice() * .37 - cosmetic.getDiscount();
		total = Math.round(total* 100.0)/100.0;
		System.out.println("Cosmetic:"+ cosmetic.getName() + ", Total Cost With Tax = $" + total);
		// TODO Auto-generated method stub
		return total;
		
	}


}
