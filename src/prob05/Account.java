package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	Account(){
		
	}
	Account(String accountNo){
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
		this.accountNo=accountNo;
		this.setBalance(0);
	}
	
	public void save(int balance){
		this.balance +=balance;
		System.out.println(this.accountNo+" 계좌에 "+balance+"만원이 입금되었습니다.");
	}
	public void deposit(int balance){
		this.balance -=balance;
		System.out.println(this.accountNo+" 계좌에 "+balance+"만원이 출금되었습니다.");		
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(accountNo+" 계좌가 개설되었습니다.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}