package Study;

public class Threadlambda {
	
	public static void main(String args[]) {
		// ���� ǥ���� �⺻ ����
         new Thread( new Runnable() {
			@Override
			public void run() {
				 System.out.println("best!!");
			}
        }).start();
        
    }

}
