import java.util.Scanner;

public class Menu 
{
    
    Scanner objScanner = new Scanner(System.in);

    // methods
    public int getFirstNumber()
    {
        System.out.println("enter first num ");
        int firstNum = objScanner.nextInt();
        return firstNum;
    }

    public int getSecondNumber()
    {
        System.out.println("enter second num ");
        int secondNum = objScanner.nextInt();
        return secondNum;
    }

    public int getChoiceNumber()
    {                   
        String choice = "enter 1 for add \n" + "enter 2 for sub \n" + "enter 3 for mult \n" + "enter 4  for divide" ;
        System.out.println(choice);
        int chosenNum = objScanner.nextInt();
        return chosenNum;
    }
}

