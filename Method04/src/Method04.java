import java.util.Scanner;

/*
문제) 정수 1개와 문자 1개를 입력하여 좌하변이 직각인 삼각형을 입력한 문자로 출력하는 프로그램을 작성하시오.
- 각 행을 출력하는 부분을 메소드로 만들어 사용하시오. 메소드명 : putChar

< 입력 화면 설계 >
정수 입력 : 5
문자 입력 : @

< 출력 화면 설계 >
@
@@
@@@
@@@@
@@@@@

*/
public class Method04 {
	
	// 메소드 정의
	static void putChar(int n, char c) { // 반환되는 값이 없을 때 static void 기재
		 for(int i = 0; i < n; i++) {
				System.out.print(c);
		} 
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 입력창
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		System.out.print("문자 입력 : ");
		char c = sc.next().charAt(0);
		
		// 출력창
		for(int i = 0; i < n; i++) {
			putChar(i+1, c);
			System.out.println();
		}
		
		
		/*
		 * for(int i = 0; i < n; i++) {
		 * 		for(int j = 0; j < i+1; j++) {
		 * 			Sytem.out.print(c);
		 * 		}
		 * 		System.out.println();
		 * }
		*/
		
		sc.close();
	}

}
