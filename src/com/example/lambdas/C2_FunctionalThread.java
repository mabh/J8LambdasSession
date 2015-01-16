package com.example.lambdas;

public class C2_FunctionalThread {
	
	private final int number = 20;
	
	public void call() {
		/* Thread init with Anon class */
		new Thread(
			new Runnable() { //Marked Functional interface 
				@Override
				public void run() {
					System.out.println("ID is " + Thread.currentThread().getId());
					//cannot access this.number
				}
			}
		).start();	
		
		/* Thread init with Lambda expression */
		new Thread(
			() -> System.out.println(this.number)
		).start();
		
	}
	
	public static void main(String[] args) {
		new C2_FunctionalThread().call();
	}
}
