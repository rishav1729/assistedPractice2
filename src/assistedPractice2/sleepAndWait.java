//Writing the program in Java to demonstrate sleep() and wait()

package assistedPractice2;

public class sleepAndWait {
	
	    private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(1000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(1000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
	        }
	    }

}
