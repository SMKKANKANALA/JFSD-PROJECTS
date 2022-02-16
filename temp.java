// @author smk
package prj;
import java.util.Scanner;
public class temp 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double farhen,celsius;
		Scanner sc = new Scanner(System.in);
		 System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
		 int choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 System.out.println("Enter  Fahrenheit temperature");
          	 farhen = sc.nextDouble();
          	 celsius = (farhen-32)*5/9;
          	 System.out.println("Celsius temperature is = "+celsius);
          	 break;
		 case 2:
			 System.out.println("Enter  Celsius temperature");
          	 celsius = sc.nextDouble();
          	 farhen=((9*celsius)/5)+32;
          	 System.out.println("Fahrenheit temperature is = "+farhen);
          	 break;
          default:
        	  System.out.println("Please choose valid choice..");
			}

}
}
