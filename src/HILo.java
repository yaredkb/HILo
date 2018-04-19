import java.util.Scanner;
public class HILo {
    public static void main(String[] args){
        //get ready for the player to use the keyboard
        Scanner scan = new Scanner(System.in);
   //play again string
        String playAgain = "";
        do {
            //create a random number from 1-100
            int theNumber = (int) (Math.random() * 100 + 1);


            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 100:");

                //get the user's guess
                guess = scan.nextInt();

                if (guess < theNumber)
                    System.out.println(guess + "is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + "is too high.Tray again");
                else
                    System.out.println(guess + "is correct! You win!");
            }
            //ask for 'Y' to play again
            System.out.println("Would you like to play again(y/n)?");
            playAgain = scan.next();
        } while(playAgain.equalsIgnoreCase("y"));
        //thank the user for playing
        System.out.println("Thank you for playing! Goodbye.");

    }
