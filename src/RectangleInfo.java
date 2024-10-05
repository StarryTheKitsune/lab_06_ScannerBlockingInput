import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        double area;
        double perimeter;
        double diagonal;
        double diagonalSquared;
        String trash;
        boolean doneWidth = false;
        boolean doneHeight = false;

                do {
                    System.out.println("Enter the width of the rectangle: ");
                    if (in.hasNextDouble()) {
                        width = in.nextDouble();
                        in.nextLine();
                        doneWidth = true;
                    }
                    else{ trash = in.nextLine();
                    System.out.println("You entered " + trash + ". Please enter a valid number." );
                    }
                }
                while (!doneWidth);
                do {
                    System.out.println("Enter the height of the rectangle: ");
                    if (in.hasNextDouble()) {
                        height = in.nextDouble();
                        in.nextLine();
                        doneHeight = true;
                    }
                    else {
                        trash = in.nextLine();
                        System.out.println("You entered " + trash + ". Please enter a valid number.");
                    }
                } while (!doneHeight);
            area = width * height;
            perimeter = 2 * width + 2 * height;
            diagonalSquared = width * width + height * height;
            diagonal = java.lang.Math.sqrt(diagonalSquared);
            System.out.println("The area of the rectangle is " + area + ".\n The perimeter of the rectangle is " + perimeter + ".\n The diagonal of the rectangle is " + diagonal + ".");

    }
}
