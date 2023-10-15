package day05.practice;

//Change the below class to have setters and Getters and Constructors
class Account  {
	String accNo;
	double balance;
	public Account(String accNo,double balance) {
		this.accNo=accNo;
		this.balance=balance;
		
		System.out.println(accNo);
		
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}

//Create an implementation of the below Interface
 interface Atm {
 boolean deposit(Account account, double amount);
 boolean withdraw(Account account,double amount) throws Exception;
 double getBalance(Account account);
}

class AxisAtm  implements Atm {
     

	@Override
	public boolean deposit(Account account, double amount) {
	   
		account.balance+=amount;
		return true;
	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		    if(account.balance<5000.0) {
		    	throw new Exception("amnt reached min balanace");
		    	
		    }
		    else {
		    	account.balance-=amount+5;
		    }
		return true;
	}

	@Override
	public double getBalance(Account account) {
		return account.balance;
	}
	
}

public class MyAtm{
	public static void main(String[] args) {
		Account acc= new Account("AxisAtm", 10.2);
		Atm atm= new  AxisAtm();
		atm.deposit(acc, 50000.0);
		try {
			atm.withdraw(acc, 8000.0);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(atm.getBalance(acc));
		
		
		
	}
}
