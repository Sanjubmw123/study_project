package Learn_abstract_interface;

public abstract class Bank {

	public abstract void loan();
	public abstract void interestRate();
	public void credit() {
		System.out.println("all credit good");
	}
	public void debit() {
		System.out.println("all debit good");
	}
}
