package Day7;

public class ThreadinJava {

	public static void main(String[] args) {
		Thread t = new Thread()
        {
            public void run()
            {
                System.out.println(getThreadGroup());    
            }
        };
 
        t.run();

	}

}
