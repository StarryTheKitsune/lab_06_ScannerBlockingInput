import java.util.Scanner;
public class CtoFConverter {
    public static void main(String[] args)
    {
        double tempC = 0;
        double tempF = 0;
        Scanner in = new Scanner(System.in);
        String trash;
        boolean done = false;
        do
        {
            System.out.println("What is the temperature? (In Celsius): ");
            if(in.hasNextDouble()) // OK safe to read in a double
            {
                tempC = in.nextDouble();
                in.nextLine(); // clears the newline from the buffer
                done = true; // we got a valid number so we can end the loop
            }
            else
            {
                // Not a double so use nextLine() instead to read a String
                trash = in.nextLine();
                System.out.println("You said: " + trash + ". Please enter a valid number.");
            }
        }while(!done); // initially done is false so !done i.e. NOT FALSE, is true
        // when done is true !done i.e. NOT TRUE is false
        tempF = tempC * 1.8 +32;
        System.out.println("The temperature is: " + tempF + " Degrees Farenheit");


    }
}