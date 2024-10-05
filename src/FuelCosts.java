import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tankSize = 0;
        double gasPrice = 0;
        double fuelEfficiency = 0;
        double per100;
        double fullTank = 0;
        String trash;
        boolean doneSize = false;
        boolean donePrice = false;
        boolean doneEfficiency = false;

        do
        {
            System.out.print("Enter your tank size. (In gallons): ");
            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                doneSize = true;
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You said: " + trash + ". Please enter a valid amount.");
            }
        }while(!doneSize);
        do
        {
            System.out.print("Enter your gas price: ");
            if(in.hasNextDouble())
            {
                gasPrice = in.nextDouble();
                in.nextLine();
                donePrice = true;
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You said your gas price was: $" + trash + ". Please enter a valid amount.");
            }
        }while(!donePrice);
        do
        {
            System.out.print("Enter your fuel efficiency (Miles per gallon): ");
            if(in.hasNextDouble())
            {
                fuelEfficiency = in.nextDouble();
                in.nextLine();
                doneEfficiency = true;
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You said your fuel efficiency is " + trash +". Please enter a valid amount.");
            }
        }while(!doneEfficiency);
        per100 = (100 / fuelEfficiency) * gasPrice;
        fullTank = tankSize * fuelEfficiency;
        System.out.println("It would cost $" + per100 + " to drive 100 miles. \n You could go " + fullTank + " miles on a full tank.");
    }
}