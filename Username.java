/*
 * @author Ruiqian Yao
 * E-mail: yaoruiqian@gmail.com
 * Assignment name: Class Exercise 3.3
 * Date:25/2/2015
 */
import java.util.Scanner;//import the scanner
public class Username {

	public static void main(String[] args) {
		String inputusername,inputpassword,username,password;//declare the strings
		Scanner keyboard=new Scanner(System.in);//get the keyboard ready
		username="CSC-200";//define the strings
		password="Nova";
		System.out.println("Enter your username(CSC-200).");//prompt for the username and password and read them
		inputusername=keyboard.next();
		System.out.println("Enter your password(nova).");
		inputpassword=keyboard.next();
		if(inputusername.equals(username)&&inputpassword.equalsIgnoreCase(password)){
			System.out.println("Welcome "+username+".");
		}else{
			System.out.println("Wrong username or password");//print the answer
		}
		
		
		

	}

}
