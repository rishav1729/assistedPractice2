//Writing a program in Java by extending the Thread class
package assistedPractice2;

public class MyThread extends Thread{
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		MyThread mt = new  MyThread();
  		mt.start();
 	}


	}


