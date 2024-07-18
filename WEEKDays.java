
import java.util.Scanner;
public class WEEKDays
{
	public static void main(String[] args) {
		Scanner day = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = day.nextInt();
		switch (n){
		    case 1:
		        System.out.println("Day: Sunday");
		        break;
		    case 2:
		        System.out.println("Day: Monday");
		        break;
		    case 3:
		        System.out.println("Day: Tuesday");
		        break;
		    case 4:
		        System.out.println("Day: Wednesday");
		        break;
		    case 5:
		        System.out.println("Day: Thursday");
		        break;
		    case 6:
		        System.out.println("Day: Friday");
		        break;
		    case 7:
		        System.out.println("Day: Saturday");
		        break;
		    default:
		        System.out.println("Day: Invalid day number.");
		             
		}
	}
}
