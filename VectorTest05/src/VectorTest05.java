import java.util.List;
import java.util.Vector;

public class VectorTest05 {
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		Vector<Integer> v2 = new Vector<Integer>();
		Vector<Integer> v3 = new Vector<Integer>();
		
		
		v1.add(10); v1.add(20); v1.add(30); v1.add(40);
		v2.add(30); v2.add(40); v2.add(50); v2.add(60);
		
		System.out.println("v1 : " + v1);
		System.out.println("v2 : " + v2);
		
		System.out.println("�������������� ���̿��� ���� �����͸� ���⦡��������");
		v1.retainAll(v2); // 
		System.out.println("v1 : " + v1);
		
		System.out.println("������v3�� 10���� 10�� �����Ͽ� 100����������");
		for(int i = 10; i<=100; i +=10) {
			v3.add(i);
		}
		System.out.println("v3 : " + v3);
		
		System.out.println("���������� ������ �κ� ������ ���� �ٸ� ���ͦ�������");
		List<Integer> v4 = (List<Integer>)v3.subList(2, 7); // 2������ 7�� �ձ���, ����ȣ�� �������� ����
		System.out.println("v4 : " + v4);

	}

}