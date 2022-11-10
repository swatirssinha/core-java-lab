/*
Program: WAP to find student marks
@author: Swati sinha
@Date: 10 nov 2022  
*/
 


import java.util.Scanner;

//declaring a class
public class Student_Marks
{
	//main started
    public static void main(String[] args) 
    {
		//taking input
        int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
    }
	//end of class
}
//end of main