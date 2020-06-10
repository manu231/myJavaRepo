package encapsulation;

public class Bank {
	
	
	public int accountNo = 123456;
	public int pinNo = 1234;
	public  double  balanceAmount = 5000;
	
	
	public void withdrawAmount(int accno,int pin, double amount) {
		
		if(accountNo==accno && pinNo==pin) {
			if(amount<=balanceAmount) {
				balanceAmount = balanceAmount - amount;
				System.out.println("Amount withdrawl : " +amount);
				System.out.println("Balance Amount is :" +balanceAmount);
			}
			else {
				System.out.println("Insufficient Balance");
			}
			System.out.println("Successful  withdrawn");
		} else {
			System.out.println("Invalid credentials");
			
		}
		
		
	}
	
	public void updatePIN(int accNo,int oldPin,int newPin) {
		if (accNo ==accountNo  && oldPin == pinNo) {
			pinNo = newPin;
			System.out.println("PIN changed successfully");
		} else {
			System.out.println("Verify old PIN Number");
		}
		
	}
	
	
	
	
	

}
