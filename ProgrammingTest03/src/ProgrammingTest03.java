import java.util.ArrayList;
import java.util.Iterator;

class Account {
	private String name;
	private String no;
	private int balance;
	
	public Account(String name, String no, int balance) {
		this.name = name;
		this.no = no;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getNo() {
		return no;
	}
	
	public int getBalance() {
		return balance;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNo(String no) {
		this.no = no;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "[계좌명의 : " + name + ", 계좌번호 : " + no + ", 예금잔고 : " + balance + "]";
	}
}

public class ProgrammingTest03 {
	public static void main(String[] args) {
		Account[] Account = new Account[] {
				new Account("동백", "123-456", 5000),
				new Account("황용식", "654-321", 3500),
				new Account("강종렬", "789-478", 6700),
				new Account("제시카", "852-741", 2600),
				new Account("노규태", "369-852", 8400)
		};
		
		ArrayList<Account> accountList = new ArrayList<Account>();
		for(int i = 0; i<Account.length; i++) {
			accountList.add(Account[i]);
		}
		
		System.out.println("--- 데이터 입력하고 출력 ---");
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- 데이터 수정하고 출력 ---");
		for(int i =0; i<accountList.size(); i++) {
			if(accountList.get(i).getName().equals("황용식")) {
				accountList.get(i).setBalance(4800);
			}
		}
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- 데이터 삭제하고 출력 ---");
		for(int i =0; i<accountList.size(); i++) {
			if(accountList.get(i).getName().equals("제시카")) {
				accountList.remove(i);
			}
		}
		for(int i = 0; i<accountList.size(); i++) {
			System.out.println(accountList.get(i));
		}
		
		System.out.println("--- Iterator를 이용하여 출력 ---");
		Iterator<Account> it = accountList.iterator();
		while(it.hasNext()) {
			Account a = it.next();
			System.out.println(a);
		}
		
	}
}
