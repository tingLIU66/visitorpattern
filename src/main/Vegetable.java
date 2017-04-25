package main;
//Khin Si | COMP 373 Project 4
public class Vegetable implements Things {
	private String name;
	private double price;
	
	public Vegetable(String name, double price)
	{
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public double accept(CartVisitorImp cartVisit) {
		// TODO Auto-generated method stub
		return cartVisit.visit(this);
	}

}