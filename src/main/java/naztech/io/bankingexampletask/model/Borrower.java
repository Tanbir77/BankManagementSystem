package naztech.io.bankingexampletask.model;

public class Borrower {
	
	private Customer customer;
//	private String customerId;
//	private String customerName;
	private Loan loanNumber;
	
	public Borrower() {
		}
	
	public Borrower(Customer customer, Loan loanNumber) {
		this.customer = customer;
		this.loanNumber = loanNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Loan getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(Loan loanNumber) {
		this.loanNumber = loanNumber;
	}

}
