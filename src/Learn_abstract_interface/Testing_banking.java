package Learn_abstract_interface;

public class Testing_banking {

	public static void main(String[] args) {
		Chase_bank cb=new Chase_bank();
		cb.loan();
		cb.credit();
		cb.debit();
		cb.funding();
		cb.interestRate();
		
		Bank B=new Chase_bank();
		B.loan();
		B.credit();
        B.debit();
        B.interestRate();
       
	}
	

}
