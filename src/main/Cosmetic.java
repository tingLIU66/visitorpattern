package main;
//Khin Si | COMP 373 Project 4
public class Cosmetic implements Things {
	private String name;
	private double price;
	private double discount;
	public Cosmetic (String name, double price, double discount)
	{
		this.name = name;
		this.price = price;
		this.discount = discount; 
		
	}
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getDiscount() {
		return discount;
	}

	

	@Override
	public double accept(CartVisitorImp cartVisit) {
		// TODO Auto-generated method stub
		return cartVisit.visit(this);
	}

}
