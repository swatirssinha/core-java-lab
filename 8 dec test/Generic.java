package Com.Question2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Generic {

	public int iD(int iD)
	{
		return iD;
		
	}
	public String Name(int iD, String name)
	{
		return name;
		
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <Integer, String> l = new HashMap<>();
		l.put(1, "Saurabh Kumar");
		l.put(2, "Rohit Kumar");
		l.put(3, "Baivabh kumar");
		
		System.out.println("please Enter: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		sc.close();
	}

}