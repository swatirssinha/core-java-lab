/*
Program: WAP a program t0 print traffic
@author: Swati sinha
@Date: 01 dec 2022  
*/





package Com.Question2;

// declaring a class
public class Traffic extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread A = new Thread();
		Thread B = new Thread();
		Thread C = new Thread();
		System.out.println("RED LIGHT IS ON");
		A.start();
		try {
			A.sleep(3000);
			System.out.println("RED LIGHT IS OFF");
			System.out.println("GREEN LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		B.start();
		try {
			B.sleep(8000);
			System.out.println("GREEN LIGHT IS OFF");
			System.out.println("YELLOW LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		C.start();
		try {
			C.sleep(10000);
			System.out.println("RED LIGHT IS ON");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// end of class

	}
	// end of main
