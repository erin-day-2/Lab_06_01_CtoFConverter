import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
	Scanner in = new Scanner(System.in);

    double numF;
    double numC;
    String trash = "";


    System.out.print("Please enter your Celsius: ");

    if(in.hasNextDouble())
    {
        numC = in.nextDouble();
        in.nextLine();
        numF = (numC * 9/5) + 32;
        System.out.println("The Fahrenheit is: " + numF);
    }
    else
    {
        trash = in.nextLine();
        System.out.println("Illegal number: " + trash);
        System.out.println("Exiting...run the program again!");
        System.exit(0);
    }

    }
}
