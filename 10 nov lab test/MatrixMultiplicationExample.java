  /*
Program: WAP to find matrixmultiplication
@author: Swati sinha
@Date: 10 nov 2022  
*/
  
  import java.util.Scanner;
  
  //declaring a class

public class MatrixMultiplicationExample 
{
	
	//main started

  public static void main(String args[]) 
  {
    int row1, col1, row2, col2;
    Scanner s = new Scanner(System.in);

    // Input dimensions of First Matrix: A
    System.out.print("Enter number of rows in first matrix: ");
    row1 = s.nextInt();

    System.out.print("Enter number of columns in first matrix: ");
    col1 = s.nextInt();

    // Input dimensions of second matrix: B
    System.out.print("Enter number of rows in second matrix: ");
    row2 = s.nextInt();

    System.out.print("Enter number of columns in second matrix: ");
    col2 = s.nextInt();

    // Requirement check for matrix multiplication
    if (col1 != row2) 
	{
      System.out.println("Matrix multiplication is not possible");
      return;
    }
	//end of class
  }
  //end of main
}