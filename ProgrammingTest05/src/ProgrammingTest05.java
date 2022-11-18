import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ProgrammingTest05 {
	public static void main(String[] args) {
		String data = "우영우-97,이준호-55,정명석-93,한수현-88,권민우-75";
		
		String[] student = data.split(",");
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i<student.length; i++) {
			String[] w = student[i].split("-");
			map.put(w[0], Integer.parseInt(w[1]));
		}
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		int tot = 0;
		double ave = 0.0;
		int max = 0;
		int min = 100;
		String s1 = "";
		String s2 = "";
		while(it.hasNext()) {
			String name = it.next(); // key
			int score = map.get(name); // value
			tot += score;
			
			if(score >= 80) {
				System.out.println(name + " 학생은 " + score + "점으로 PASS입니다.");
			} else {
				System.out.println(name + " 학생은 " + score + "점으로  FAIL입니다.");
			}
			ave = (double)tot / keys.size();
			
			if(max < map.get(name)) {
				max = map.get(name);
				s1 = name;
			}
			
			if(min > map.get(name)) {
				min = map.get(name);
				s2 = name;
			} 
			
		}
		System.out.println("총점 : " + tot);
		System.out.println("평균 : " + ave);
		System.out.println("최고 점수 : " + s1 + "(" + max + ")");
		System.out.println("최저 점수 : " + s2 + "(" + min + ")");


		
	}

}
