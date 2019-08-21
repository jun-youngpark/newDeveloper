package Study;

public class Threadlambda {
	
	public static void main(String args[]) {
		// 람다 표현식 기본 예제
         new Thread( new Runnable() {
			@Override
			public void run() {
				 System.out.println("best!!");
			}
        }).start();
        
    }

}
