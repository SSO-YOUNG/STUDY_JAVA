
public class StringTest09 {
	public static void main(String[] args) {
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("──────────────────");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println("──────────────────");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println("──────────────────");
		
		// 18. intern() : 문자열의 내용이 같은 인스턴스가 각각 존재할 때, 이 문자열이 하나의 인스턴스를 참조하도록 만듦 
		s1 = s1.intern();
		s2 = s2.intern();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		
	}

}
