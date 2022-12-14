
/*
< 클래스를 사용하지 않았을 때의 문제점을 파악하기 위한 예제 >
- 은행 계좌 클래스 - 계좌명의, 계좌번호, 예금잔고

< 문제점 >
1. 계좌의 정보를 변수명, 주석으로 알 수 있다
2. 한 사람의 계좌라면 하나로 묶어서 처리할 수 있어야 하나, 그렇지 않다
3. 아무나 변수를 통해 출금, 입금이 가능하고 계좌정보를 변경할 수 있다

*/
public class AccountTest01 {
	public static void main(String[] args) {
		// john의 은행 계좌
		String johnAccountName = "john"; // john의 계좌명의
		String johnAccountNo = "123456"; // john의 계좌번호
		int johnAccountBalance = 1000; // john의 예금잔고
		
		// mary의 은행 계좌
		String maryAccountName = "mary"; // mary의 계좌명의
		String maryAccountNo = "654321"; // mary의 계좌번호
		int maryAccountBalance = 500; // mary의 예금잔고
		
		johnAccountBalance -= 200; // 출금
		maryAccountBalance += 100; // 입금
		
		System.out.println("● John의 은행 계좌");
		System.out.println("   계좌명의 : " + johnAccountName);
		System.out.println("   계좌번호 : " + johnAccountNo);
		System.out.println("   예금잔고 : " + johnAccountBalance);
		
		System.out.println();
		
		System.out.println("● Mary의 은행 계좌");
		System.out.println("   계좌명의 : " + maryAccountName);
		System.out.println("   계좌번호 : " + maryAccountNo);
		System.out.println("   예금잔고 : " + maryAccountBalance);
		
	}

}
