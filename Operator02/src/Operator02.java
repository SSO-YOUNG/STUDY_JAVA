
/*
5. ��Ʈ ������ : &(��ƮAND), |(��ƮOR), ^(Exclusive OR, XOR, ��Ÿ��OR), ~(��ƮNOT)
- ��Ʈ ����(2���� ����)�� �ϴ� ������
- & -> ^ -> | ������ �켱 ������ ����
- & : �� ���� ��Ʈ�� ��� 1�� �� ����� 1
- | : �� ���� ��Ʈ �߿��� �ϳ��� 1�̸� ����� 1
- ^ : �� ���� ��Ʈ �߿��� �ϳ��� 1�� �� ����� 1
- ~ : 1�� 0���� 0�� 1�� ��ȯ

6. ����Ʈ ������ : <<(left shift), >>(right shift)
- ��Ʈ ����(2���� ����)�� �ϴ� ������
- << : 2������ ����
- >> : 2������ ������

7. ���� ���� ������(���� ������)
- ? : -> ���ǽ�  ? true : false -> ���ǽ��� ����� true�̸� true�� ��, false�̸� false�� ���� ���ϴ� ������
- ���ǹ�(if~else)�� ������� ���� ���

8. ���� ������, ���� ���� ������(���� ������)
- = : ���� ������, ��� ������ ���� ������ ������ ���� ���� ������ ���� ����
- +=, -=, *=, /=, %= ... : ���� ���� ������

< �������� ���� ������ ���� �з� >
1. ���� ������ : ���� 1���� �ʿ��� ������ -> ������ �켱 ������ ���� ����
ex) ++(����), --(����), !(����NOT), ~(��ƮNOT), +(��ȣ), -(��ȣ)
2. ���� ������ : ���� 2�� �ʿ��� ������
ex) ���װ� ������ ������ ���� ��� ������, ���/��/����(����NOT����)/��Ʈ(��ƮNOT����)/����Ʈ ������ 
3. ���� ������ : ���� 3�� �ʿ��� ������
ex) ? : -> ���� ���� ������ 1�� �� 

�ڡڡ�
< ������ �켱 ���� >
1. ���� ������ : +, -, ++, --, !, ~
2. ��� ������
*, /, %
+, -
3. ����Ʈ ������ : <<, >>
4. �� ������ 
>, >=, <, <=
==, !=
5. ��Ʈ ������
&
^
|
6. ���� ������
&&
||
7. ���� ���� ������
8. ���� ������, ���� ���� ������

< �ַ� ����ϴ� �������� �켱 ���� >
���� > ��� > �� > ���� > ����

*/

public class Operator02 {
	public static void main(String[] args) {
		/*
		int a = 57, b = 83;
		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);
		
		int c = 4, d = 64;
		System.out.println( c << 3); // 2�� 3�� ����, *2^3 -> 32
		System.out.println( d >> 4); // 2�� 4�� ����, /2^4 -> 4
		*/
		
		/*
		int a = 10, b = 5, c, d;
		
		c = a>b ? a : b;
		System.out.println(c);
		
		d = a<b ? a : b;
		System.out.println(d);
		*/
		
		// ���� 1) a�� b�� ���� ���ؼ� a�� �����Ͻÿ�.
		int a = 10, b = 20;
		// a = a + b;
		a += b; // ���� ���� ������
		System.out.println(a);
		
		// ���� 2) x�� ���� 1�����Ͽ� �����ϰ�, x�� ���� ����Ͻÿ�.
		int x = 10;
		/*
		//++x;
		//x++;
		//x = x + 1;
		x += 1;
		System.out.println(x);
		*/
		
		// ������ ������ ����
		System.out.println(x++);
		System.out.println(x);
		
		/*
		// 2����
		x = x + 2;
		x += 2;
		
		// 3����
		x = x + 3;
		x += 3;
		*/
		
	}

}