//Aula sobre lambda expression
public class ThreadExemplo {

	public static void main(String[] args) {
		
		//Thread SEM lambda
        Thread t1=new Thread( new Runnable(){
        	
        	@Override
        	public void run(){  
                System.out.println("Thread 1 em execução...");  
            }  
        });  
        t1.start();  
		

		//Thread COM lambda
		Thread t2 = new Thread(() -> {
			System.out.println("Thread 2 em execução...");
		});
		t2.start();

	}

}
