import java.util.Random;
import java.util.Scanner;

public class RandomGeneratorGame {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            System.out.println("********** NUMBER GAME **********");
            System.out.println("Enter only Numbers between 1 to 100.");
            int rand = random.nextInt(101);
            boolean flag = false;
            System.out.print("Enter the Guess for Generated Number: ");
            int guess = sc.nextInt();
        while(true){  
                if(guess == rand){                    
                    System.out.println("Your Guess is Correct");
                    break;
                }
                else if (guess < rand)
                    System.out.println("Your Guess is to Low");
                else
                    System.out.println("Your Guess is to High");
                System.out.print("Enter the Guess for Generated Number: ");
                guess = sc.nextInt();          
        }
            System.out.println("CONGRATULATIONS YOU WON THE GAME!!!");
            sc.close();
    
        } catch (Exception e) {
        System.out.println(e);
        }
    }
}
