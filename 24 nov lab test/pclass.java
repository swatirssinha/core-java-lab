/*
Program: WAP a program to create a class
@author: Swati sinha
@Date: 24 nov 2022  
*/
//declaring a class
class pclass
//main started
{
	public void pmethod ()
	{
		system.out.println("this is parent class");
	}
}
class cclass extends pclass
{
	public void cmethod()
	{
		system.out.println("this is child class ");
	}
}
class Ans
{
	public ststic void main(string []args)
	{
		pclass m= new pclass();
		cclass n= new cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();
	}
	//end of main
}
//end of class

		