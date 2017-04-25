package main;
//Khin Si | COMP 373 Project 4
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CartVisitorImp CartVisitorImp = new CartVisitor();
		System.out.println("*******Today's Transaction********\n");
		Things[] thing = new Things[]{new Vegetable("Bag of Carrots", 2.50),
                new Cosmetic("Lipstick", 7.99, 2.00),
                new Vegetable("Box of Tomatoes", 8.00)};
	    double total = calculateTotalPrice(thing);
        total = Math.round(total*100.0)/100.0;
        System.out.println("_____________________________");
        System.out.println("Total Cost = $" + total);
    }

    private static double calculateTotalPrice(Things[] thing) {
        CartVisitorImp cartVisitor = new CartVisitorImp();
        double total = 0;
        for ( int i = 0 ; i < thing.length ; i ++)
        {
        	   total += thing[i].accept(cartVisitor);
        	
        }
 
        return total;
    }

}
