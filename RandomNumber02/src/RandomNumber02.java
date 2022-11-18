
// ����) 6���� ������ �ߺ����� �ʰ� �����Ͽ� �ζǹ�ȣ�� ��� int�� 1���� �迭 lotto�� �����ϰ�,
// ������������ �����Ͽ� ����Ͻÿ�.
public class RandomNumber02 {
	public static void main(String[] args) {
		// �迭 ����
		int[] lotto = new int[6];
		
		// �迭�� �ߺ����� ���� ���� 6�� ����
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45) + 1; // 1 ~ 45������ ����
			for(int j = 0; j < i; j++) { // ���� �� ����
				if(lotto[i] == lotto[j]) { // ������ ����� ������ ������ ���ٸ� --i
					--i;
				}
			}
		}
		
		// ���� ����
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int t = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = t;
				}
			}
		}
		
		//���
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		
	}

}