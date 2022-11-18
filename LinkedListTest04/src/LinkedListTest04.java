import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
< ArrayList�� LinkedList�� ���� �ð� �� >




*/
public class LinkedListTest04 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		System.out.println(" - ������ �߰� - ");
		add(al);
		add(ll);
		System.out.println();
		System.out.println(" - ���� �ð� �� - ");
		System.out.println("ArrayList  �ð� : " + access(al) + " ms");
		System.out.println("LinkedList �ð� : " + access(ll) + " ms");
		
	}
	
	public static void add(List<Integer> list) {
		for(int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}
	
	public static long access(List<Integer> list) {
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++) {
			list.get(i);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	

}