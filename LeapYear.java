import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) {
		Scanner year = new Scanner(System.in);
		System.out.println("Enter a year : ");
		int Yr = year.nextInt();
	    if ((Yr % 4 == 0 && Yr % 100 != 0) || Yr % 400 == 0) {
            System.out.println(Yr + " is a leap year.");
        } else {
            System.out.println(Yr + " is not a leap year.");
        
	    }
	}
}
