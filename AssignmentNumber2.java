/*
 * @author Ruiqian Yao
 * date 2/20/2015
 * E-mail yaoruiqian@gmail
 * purpose Assignment2
 * professor Tanes Kanchanawanchai
 * class CSC-200 003N
 */
import javax.swing.JOptionPane;//import all the utilities that my needed.
import java.lang.Math;
import java.util.Scanner;

public class AssignmentNumber2 {

	public static void main(String[] args) {
	int a,b,c,d,e,sum,max1, max2,max3,max4,min1,min2,min3,min4;// declare all the variables that my be used in the following program.
	double average;
	Scanner keyboard =new Scanner(System.in);//declare the scanner
	System.out.println("Enter five numbers ");//prompt the users to enter five numbers
	a=keyboard.nextInt();//store all the values of five numbers that the users entered as in a,b,c,d,and e.
	b=keyboard.nextInt();
	c=keyboard.nextInt();
	d=keyboard.nextInt();
	e=keyboard.nextInt();
	sum=a+b+c+d+e;//declare the sum
	average=sum/5;//calculate the average
	max1=Math.max(a, b);//compare the maximum of the five numbers
	max2=Math.max(c, d);
	max3=Math.max( max1, e);
	max4=Math.max(max3, max2);
	min1=Math.min(a, b);//compare the minimum of the five numbers 
	min2=Math.min(c, d);
	min3=Math.min(min1,e);
	min4=Math.min(min3, min2);
	System.out.println("The sum of fove numbers is "+sum+
			           "\nThe average of five numbers is " +average+
			           "\nThe maxmum of the five numbers is "+ max4+
			           "\nThe minimum of the five numbers is "+min4);//output the sum, average, maximum,and the minimum
	
	
	
	
	
	
	
	
	

	}

}
