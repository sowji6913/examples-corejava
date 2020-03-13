import java.util.*;
public class PaytmApp {
	static float balance=100;
	public synchronized void addMoney(float amount) {
		balance+=amount;
		System.out.println("Amount added-balance="+balance);
		notify();
		
	}
	public synchronized void recharge(float amount){
		if(amount>balance) {
		
		
		try {
			System.out.println("INSUFFICIENT BALANCE..");
			wait();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		}
		if(amount<=balance)
		System.out.println("recharge done........");
	}

	public static void main(String[] args) {
		PaytmApp app=new PaytmApp();
		Runnable r1=()->app.recharge(500);
		Runnable r2=()->app.addMoney(1000);
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}

}

