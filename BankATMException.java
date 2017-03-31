package bankatmproject;

//defines bankatmexception on low balance avalability

public class BankATMException extends Exception {
	
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//Exception message
		return "Balance cannot be less than 10000";
	}

}
