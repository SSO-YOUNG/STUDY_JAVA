
/*
< this를 사용하는 2가지 방법 >
1. this.  : 자신의 인스턴스를 참조하는 참조변수
2. this() : 자신의 클래스 내의 생성자 안에서 자신의 생성자를 호출하는 방법
*/
class Day {
	// 멤버 변수
	// 초기값을 설정 -> 1
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	// 생성자 오버로딩
	public Day() {
		this.year = 2022;
	}
	
	public Day(int year) {
		this.year = year;
	}
	
	public Day(int year, int month) {
		this(year); // 자신의 클래스 안에서 자신의 생성자를 호출하는 방법
		this.month = month;
	}
	
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	
	// 복사 생성자
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	
	// getter
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDate(int date) {
		this.date = date;
	}
	
	// 년, 월, 일을 한꺼번에 설정하는 메소드
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일을 계산하는 메소드
	// 제라의 공식 - 0 ~ 6 사이의 값을 리턴
	// 0 : 일, 1 : 월, 2 : 화, 3 : 수, 4 : 목, 5 : 금, 6 : 토
	public int dayOfWeek() {
		int y = year;
		int m = month;
		int d = date;
		
		if(m == 1 || m ==2) {
			y--;
			m += 12;
		}
		return (y + y/4 - y/100 + y/400 + (13*m+8)/5 + d) % 7;
	}
	
	// 두 개의 날짜를 비교하는 멤버 메소드
	public boolean equalDay(Day d) {
		return this.year == d.year && this.month == d.month && this.date == d.date;
	}
	
	// 날짜를 출력하는 메소드
	public String toString() {
		String[] weekDay = {"월", "화", "수", "목", "금", "토"};
		return String.format("%4d년 %2d월 %2d일 (%s요일)", year, month, date, weekDay[dayOfWeek()]);
	}
	
}

public class DayTest04 {
	public static void main(String[] args) {
		Day day1 = new Day(2022, 8, 8);
		Day day2 = new Day(day1);
		Day day3 = new Day();
		Day day4 = new Day(2023);
		Day day5 = new Day(2023, 6);
		
		// 날짜 출력 2번 방법 - 날짜를 출력하는 메소 메소드 활용
		System.out.println(day1.toString()); // toString() 생략 가능
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day5);
		
	}

}
