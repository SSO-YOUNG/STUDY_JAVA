import java.util.Scanner;

/* 문제) 월을 입력하여 계절을 출력하는 프로그램을 작성하시오.
< 입력 화면 설계 >
월 입력(1~12) : 7

< 출력 화면 설계 >
7월은 여름입니다.

3월, 4월, 5월 : 봄
6월, 7월 , 8월 : 여름
9월, 10월, 11월 : 가을
12월, 1월, 2월 : 겨울
*/

public class If07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력(1~12) : ");
		int month = sc.nextInt();
		
		String season = "";
		
		// 1번 방법 (논리 AND)
		if(month >= 3 && month <= 5 ) {
			season = "봄";
		} else if(month >= 6 && month <= 8) {
			season = "여름";
		}
		  else if(month >= 9 && month <= 11) {
			season = "여름";
		} else if(month==1 || month==2 || month==12) {
			season = "겨울";
		} else {
			season = "잘못된 월";
		}
		
		/* 2번 방법 (논리 OR)
		 if(month== 3 || month==4 || month==5 ) {
			season = "봄";
		}		
		*/
		
		
		System.out.println(month + "월은 " + season + "입니다.");
		
		sc.close();
	}

}
