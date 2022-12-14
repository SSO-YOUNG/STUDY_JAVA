
public class Infiniteloop01 {
	public static void main(String[] args) {
		
		// 무한 루프 1 -> 증감값을 생략하는 경우
		int i = 1;
		while(i <=10) {
			System.out.println(i);
			//i++;
		}
		/*
		
		// 무한 루프 1 -> 조건식을 잘못 작성한 경우
		int i = 1;
		while(i <=10) {
			System.out.println(i);
			i++;
			
		*/
		
		// 의도적으로 무한 루프를 작성하는 방법
		/* 1번 - while문 : 가장 많이 사용하는 방법
		while(true) {
			System.out.println("*");
		}
		*/
		
		// 2번 - for문
		/*
		for (; true ;) {
			System.out.println("#");
		}
		*/
		
		for (; ;) {
			System.out.println("#");
		}
		
	}
}
