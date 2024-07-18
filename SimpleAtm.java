++import java.util.Scanner;

public class SimpleAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Current Balance: ");
        float cb = input.nextFloat();
        System.out.print("Withdrawal Amount: ");
        float wa = input.nextFloat();
        float bal = 0.0f;
        if (cb > wa){
            bal = (cb - wa);
            System.out.println("Withdrawal Successful ! New balance = "+ bal);
        }
        else{
            System.out.println("Error. Insufficient Balance.");
        }
        
    }
}

