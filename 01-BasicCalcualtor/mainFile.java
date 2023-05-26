

public class mainFile
{
    public static void main (String a[])
    {
       // declaring the objects of the classes 
        switchCase objSwitchCase = new switchCase();
        Menu objMenu = new Menu();

        // taking two inputs and choice number
        int firstNum = objMenu.getFirstNumber();
        int secondNum = objMenu.getSecondNumber();           
        int chosenNum = objMenu.getChoiceNumber();

        // using switch to decide which operation to perform
        objSwitchCase.chooseOperation(chosenNum, firstNum, secondNum);
    
    }
}
