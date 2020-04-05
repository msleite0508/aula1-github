package entities;

public class Product2 {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product2 () {
		
	}
	
	/*gerado automaticamente pelo eclipse
	 * botao direito/source/Generactor constructor using fiels
	 */
	
	public Product2(String name, double price) {
		this.name = name;
		this.price = price;
		;
	}
	
	/*gerado automaticamente pelo eclipse
	 * botao direito/source/Generactor getters and setters
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	
	public double totalValueInStock () {
		return price * quantity;
	}
	
	public void addProduct (int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct (int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f",totalValueInStock());
			
			
			
	}



}