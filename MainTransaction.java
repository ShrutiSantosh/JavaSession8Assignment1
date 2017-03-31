/**
 * 
 */
package bankatmproject;


public class MainTransaction {
	
	
		static double balance = 0;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			BankATM t1 = new BankATM();
			t1.deposit(10000);
			t1.withdraw(2000);
			t1.withdraw(1000);
			t1.withdraw(1500);
			t1.deposit(3000);
			t1.withdraw(5000);
			t1.withdraw(2000);
			t1.deposit(4000);
			t1.withdraw(1000);
			t1.withdraw(20000);
			t1.deposit(10000);
			
			
		}

	}

