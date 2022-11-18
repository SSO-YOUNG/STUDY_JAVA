
/*
< 메소드의 오버로딩 >
- overloading
- 메소드의 다중 정의
- 메소드의 이름은 같지만, 매개변수의 타입 또는 개수를 다르게 정의한 것
- 주의) 매개변수의 이름이나 리턴타입은 오버로딩에 포함되지 않음

*/
public class Method08 {
	
	static int add(int x, int y) {
		return x + y;
	}
	
	// 2. 에러 : 메소드의 중복 정의 - 메소드의 매개변수의 개수와 타입이 똑같음
	/*
	static double add(int x, int y) {
		return (double)(x / y);
	}
	*/
	
	// 1. 에러 : 메소드의 중복 정의 - 메소드의 매개변수의 개수와 타입이 똑같음
	/* 
	static int add(int a, int b) {
		return x + y;
	}
	*/
	
	static double add(double x, double y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		System.out.println("정수 2개 : " + add(10, 20));
		System.out.println("실수 2개 : " + add(3.5, 7.2));
		
	}

}
