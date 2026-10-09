import java.util.Random;
import java.util.Scanner;

public class DieRoller
{
    static void main()
    {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);

        String again = "y";

        while(again.equalsIgnoreCase("y"))
        {
            int die1, die2, die3, tries, sum;

            tries = 0;

            System.out.printf("%8s%10s%10s%10s%10s%n",
                    "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("--------------------------------------------------");

            do {
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                tries++;
                sum = die1 + die2 + die3;

                System.out.printf("%8d%10d%10d%10d%10d%n",
                        tries, die1, die2, die3, sum);
            } while(die1 != die2 || die2 != die3);

                IO.println();
                IO.println("Your rolled three of a kind!");
                IO.print("Play again? (y/n): ");

                again = input.nextLine();
                IO.println();
            }
        IO.println("Thanks for playing!");
        input.close();
    }
}
