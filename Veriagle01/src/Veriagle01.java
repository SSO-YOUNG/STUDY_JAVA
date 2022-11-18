/*
변수 (variable) - 값을 저장하기위한 공간
초기화 - 변수를 선언하고, 최초로 값을 넣는 것.
오버플로우 (overflow) - 작은값 안에 큰 데이터를 넣어서 흘러 넘치는것.
 
 <변수의 명령법>
--반드시 지켜야할 규칙
1. 영어 대소문자, 숫자, 기호( _ , $[시스템 내부적으로 사용하는 기호이므로 , 개발자는 사용하지 않음.] )
2. 영어 대문자와 소문자는 구분해서 사용함.
3. 숫자는 첫글자로는 사용 불가됨.
4. 공백은 사용 불가.


--권장 사항
1. 변수명은 의미있게 생성. ex)int score , int age;
2. 한글명은 사용하지 않도록함.


--자바에서 변수명을 만드는 방법
변수명: 게임의 최고 정수
1. int maxScoreGame; 카멜(camel) 표기법, 자바에서 사용하는 방법
2. int max_score_game; 스네이크(snake) 표기법, html에서 많이 사용
3. int iMaxScoreGame; 헝그리안 표기법, i:int ,c언어 계열에서 많이 사용

★외울것★
<변수의 타입(종류)>
- 데이터 타입, date type, 자료형
1.기본형 (primitive type)

(1)정수[소수점이 없는수]
- byte 1Byte [8bit,2의8승,-128 ~ +127(-2의7승~ +2의7승)] , 
- short 2Byte [16bit,2의16승,-32768 ~ +32767(-2의15승~ +2의15승)] , 
- int 4Byte [32bit,2의32승,-2147483648 ~ +2147483647(-2의31승~ +2의31승)] , 
- long 8Byte [64bit,2의64승,-9223372036854775808 ~ +9223372036854775807 (-2의63승~ +2의63승)]
	
(2)실수[소수점이 있는수]
- float(소수점 이하 7자리 까지 정확도를 보장) 4Byte   
- double(소수점 이하 15자리까지 정확도 보장) 8Byte

- 문자:(''),ex'a','abc'잘못된것
- 문자열:(""),ex"a","abc"
- String형: 문자열형,
(3)문자 
- char 2Byte

(4)논리 [true(예) , false(아니오) 로 표현하는 데이터 타입,조건문과 반복문에서 사용함] 
- boolean 1Byte


2.참조형 (reference type)
- 배열과 모든 클래스는 창조형임, 객체지형에서 본견적으로 사용,

 */
public class Veriagle01 {
	public static void main(String[] arge){
		/*       1번 방법
		int a; //변수 선언; 메모리에 정수를 저장할 수 있는 4byte에 공간을 마련하고 이름을 a라고 붙여 놓은 것
		a = 10; //a 라는 변수에 10라는 정수를 저장했다
		*/
		
		/*		 2번 방법
		int a = 10; // 변수를 선언하고, 값을 대입 
		int b = 20; 
		*/
		
		//		 3번 방법
		
		int a = 10, b = 20; // 여러 개의 변수를 선언하고 , 바로 값을 대입 

		// \n : 줄바꿈
		// +; 문자열 연결 연산자
		// '문자' "문자열"

		System.out.println("a = " + a +  "\nb = " + b);
		//System.out.println("a = " + a);
		//System.out.println("b = " + b);
	}
}
