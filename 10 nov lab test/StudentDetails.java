/*
Program: WAP to find student record
@author: Swati sinha
@Date: 10 nov 2022  
*/
 


import java.util.Scanner;

//declaring a class


class StudentDetails
{
	//main started
    public static void main(String arg[])
    {
		//taking input
        String names[] = { "Rajesh", "Suresh", "Ramesh", "Kamlesh", "Vignesh" };
        int marks[] = { 45, 78, 83, 77, 93 };
        char sections[] = { 'A', 'B', 'A', 'A', 'B' };
        
        for(int i = 0; i < names.length; i++)
        {
            System.out.println( names[i] + " in section " + sections[i] + " got " + marks[i] + " marks." );
        } 
//end of class		
    }
	//end of main
}