import java.util.*;
public class GuessingGame{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random number = new Random();

        int num = number.nextInt(100) + 1;
        int guess;

        System.out.println("Welcome to guessing the number game.....");
        
        do{
        System.out.print("Choose the any number between (1-100): ");
        guess = sc.nextInt();
        
         if(guess > num){
            System.out.println("Number is too HIGH. Try Again.");
         }else if(guess < num){
             System.out.println("Number is too LOW. Try again.");
            } else {
                System.out.println("Correct! You guessed the correct number.");
            }
             } while (guess != num);

        sc.close();
    }
}
