package entities;

public class Account2 {

	private int number2;
	private String holder2;
	private double balance2;
	
	public Account2(int number2, String holder2) {
		this.number2 = number2;
		this.holder2 = holder2;
	}
	
	public Account2(int number2, String holder2, double initialDeposit) {
		this.number2 = number2;
		this.holder2 = holder2;
		deposit(initialDeposit);
	}
	
	public int getNumber2() {
		return number2;
	}

	public String getHolder2() {
		return holder2;
	}
	public void setHolder2(String holder2) {
		this.holder2 = holder2;
	}
	public double getBalance2() {
		return balance2;
	}

	public void deposit (double amount) {
		this.balance2 += amount;
	}
	
	public void withDraw (double amount) {
		this.balance2 -= amount + 5.00;
	}
	
	public String toString() {
		return "Account"
				+ number2
				+", Holder: "
				+ holder2
				+", Balance: $ "
				+ String.format("%.2f", balance2);
	
	}

}
