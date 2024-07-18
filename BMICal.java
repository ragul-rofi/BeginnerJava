import java.util.Scanner;

public class BMICal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Weight: ");
        float wt = input.nextFloat();
        System.out.print("Enter Your Height: ");
        float ht = input.nextFloat();
        float bmi = wt / (ht*ht);
        if (bmi < 18.5){
            System.out.println(String.format("BMI : "+"%.2f", bmi));
            System.out.println("Category : Under Weight.");
        }
        else if(bmi >= 18.5 && bmi < 24.9){
            System.out.println(String.format("BMI : "+"%.2f", bmi));
            System.out.println("Category : Normal Weight.");
        }
        else if(bmi >= 25.0 && bmi < 29.9){
            System.out.println(String.format("BMI : "+"%.2f", bmi));
            System.out.println("Category : Over Weight.");
        }
        else if(bmi >= 30.0 ){
            System.out.println(String.format("BMI : "+"%.2f", bmi));
            System.out.println("Category : Obesity.");
        }
        
    }
}

