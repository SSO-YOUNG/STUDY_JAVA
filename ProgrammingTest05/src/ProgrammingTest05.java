import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ProgrammingTest05 {
	public static void main(String[] args) {
		String data = "�쿵��-97,����ȣ-55,������-93,�Ѽ���-88,�ǹο�-75";
		
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
				System.out.println(name + " �л��� " + score + "������ PASS�Դϴ�.");
			} else {
				System.out.println(name + " �л��� " + score + "������  FAIL�Դϴ�.");
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
		System.out.println("���� : " + tot);
		System.out.println("��� : " + ave);
		System.out.println("�ְ� ���� : " + s1 + "(" + max + ")");
		System.out.println("���� ���� : " + s2 + "(" + min + ")");


		
	}

}