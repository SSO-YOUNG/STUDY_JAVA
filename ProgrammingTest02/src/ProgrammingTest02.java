import java.util.ArrayList;
import java.util.Iterator;

public class ProgrammingTest02 {
	public static void main(String[] args) {
		String data = "95,87,77,65,93,58,72,84,93,75,73,88";
		
		System.out.println("- 1번 -");
		String[] scores = data.split(",");
		for(int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
		}
		System.out.println();
		
		System.out.println("- 2번 -");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<scores.length; i++) {
			list.add(Integer.parseInt(scores[i]));
		}
		System.out.println("list : " + list);
		
		int sum = 0;
		double ave = 0.0;
		for(int i : list) {
			sum += i;
		}
		ave = sum/list.size();
		System.out.println("- 3번 -");
		System.out.println("합계 : " + sum);
		System.out.println("- 4번 -");
		System.out.println("평균 : " + ave);
		
		System.out.println("- 5. 출력 1 -");
		for(int i = 0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("- 5. 출력 2 -");
		for(Object i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("- 5. 출력 3 -");
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n + " ");
		}
		
	}

}
