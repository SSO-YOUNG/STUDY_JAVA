import java.util.Calendar;

public class CalendarTest02 {
	public static void main(String[] args) {
		// 2. Calendar Ŭ������ �ν��Ͻ��� ���� - ����ڰ� ���� ��¥�� �ð��� �����ϴ� ���
		Calendar c = Calendar.getInstance();
		
		// 2023�� ���� ������ �����Ͻ� : 7�� 10�� 19�� 30�� 35�� ����
		// ���� 0 ~ 11������ ��, ���� 6���� ���� -> �׷��� 7��°�� 7���� ��
		c.set(2023, 6, 10, 19, 30, 35);
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR); // 12�ð�
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "-" + month + "-" + date + " " + hour + ":" + minute + ":" + second);
		System.out.printf("%04d-%02d-%02d %02d:%02d:%02d\n", year, month,date,hour,minute,second);
		
		// 1. �ð����� ����, ���ĸ� �����ϴ� ��� 1
		// am(����):0, pm(����):1
		int ampm = c.get(Calendar.AM_PM);
		System.out.println(ampm);
		
		String[] ap = {"����", "����"};
		System.out.printf("%s %02d:%02d:%02d\n", ap[ampm],hour,minute,second);
		
		// 2. �ð����� ����, ���ĸ� �����ϴ� ��� 2
		String ampm2 = "";
		switch(ampm) {
		case Calendar.AM: ampm2 = "����"; break;
		case Calendar.PM: ampm2 = "����"; break;
		}
		System.out.printf("%s %02d:%02d:%02d\n", ampm2,hour,minute,second);
		
		// 3. �ð����� ����, ���ĸ� �����ϴ� ���
		hour = c.get(Calendar.HOUR_OF_DAY);
		String ampm3 = "";
		if(hour < 12) {
			ampm3 = "AM";
		} else {
			ampm3 = "PM";
		}
		System.out.printf("%s %02d:%02d:%02d\n", ampm3,hour,minute,second);
		
		// 4. �ð��� 24�ð����� �����ϴ� ���
		hour = c.get(Calendar.HOUR_OF_DAY);
		System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
		
	}

}