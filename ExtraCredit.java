import java.util.Scanner;
public class ExtraCredit {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter ten numbers dilimited by\""+","+"\"");
        keyboard .useDelimiter(",");
        int a1,a2,a3,a4,a5,a6,a7,a8,a9,a10;
        a1=keyboard.nextInt();
        a2=keyboard.nextInt();
        a3=keyboard.nextInt();
        a4=keyboard.nextInt();
        a5=keyboard.nextInt();
        a6=keyboard.nextInt();
        a7=keyboard.nextInt();
        a8=keyboard.nextInt();
        a9=keyboard.nextInt();
        keyboard.useDelimiter("");//makes the delimiter blank
        String next=keyboard.next();///because the delimiter is blank .next reads only one character at a time
        next=keyboard.nextLine();//reads everything after the comma/until the end of the line
        a10=Integer.parseInt(next);//converts string into an integer
        int sum=a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        double average=sum/10;
        System.out.println("The average of the ten numbers is "+average);
        
	}

}