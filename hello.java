import java.util.Scanner;

public class hello{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = number.nextInt();

        if (age < 13) {
            System.out.println("You are a Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager");
        } else if (age > 19 && age < 60) {
            System.out.println("You are an Adult");
        } else {
            System.out.println("You are a Senior Citizen");
        }

        number.close();
    }
}

