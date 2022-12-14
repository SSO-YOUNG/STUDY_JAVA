
public class StringTest08 {
	public static void main(String[] args) {
		// 16. split() : 문자열을 특정 구분자를 기준으로 문자열을 잘라서 문자열의 배열을 생성함
		String words = "lion,hyena,elephant,cheetah,zeebra,giraffe,monkey";
		String[] animals = words.split(",");
		
		// 출력 1번
		for(int i = 0; i<animals.length; i++) {
			System.out.println("animals[" + i + "] = " + animals[i]);
		}
		System.out.println();
	
		// 출력 2번
		for(String a : animals) {
			System.out.println(a);
		}
		System.out.println("───────────────────────");
		
		// 17. substring() : 문자열에서 특정 문자열을 추출하여 생성
		String s1 = "Hello Java World!";
		// Hello 추출
		String s2 = s1.substring(0,5); // 0번부터 5번 앞까지 추출
		System.out.println(s2);
		// Java 추출
		String s3 = s1.substring(6,10); // 6번부터 10번 앞까지 추출
		System.out.println(s3);
		// World! 추출
		String s4 = s1.substring(11,17); // 11번부터 17번 앞까지 추출
		System.out.println(s4);
		String s5 = s1.substring(11); // 11번부터 끝까지
		System.out.println(s5);
	}

}
