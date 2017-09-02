public class UMLLineItem{
	private int quantity;
	private Product theProduct;

/**
	Computes the total cost of Line Item
	@return the total price
*/
	public double getTotalPrice(){
	return theProduct.getPrice()*quantity;
	}

}