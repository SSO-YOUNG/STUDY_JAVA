
class MyThread extends Thread {
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("-"));
			if(i%50 == 0) System.out.println();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\n소요시간 1 : " + (endTime-startTime));
	}
}




public class ThreadTest02 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.start();
		
		long startTime = System.currentTimeMillis();
		for(int i=0; i<500; i++) {
			System.out.printf("%s", new String("|"));
			if(i%50 == 0) System.out.println();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\n소요시간 2 : " + (endTime-startTime));
	}

}
