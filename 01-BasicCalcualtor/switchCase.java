
public class switchCase {

    Calculator objCalc = new Calculator();

    public void chooseOperation(int choiceNum, int firstNum, int secondNum)
    { 
        switch(choiceNum)
        {
            case 1: 
                int add_result = objCalc.addNums(firstNum, secondNum);
                objCalc.resultDisplay(add_result);
                break;
            case 2: 
                int sub_result = objCalc.subtractNums(firstNum, secondNum);
                objCalc.resultDisplay(sub_result);
                break;
            case 3: 
                int mul_result = objCalc.multiplyNums(firstNum, secondNum);
                objCalc.resultDisplay(mul_result);
                break;
            case 4: 
                int divide_result = objCalc.divideNums(firstNum, secondNum);
                objCalc.resultDisplay(divide_result);
                break; 
            default:
                System.out.println("pls enter properly !!!");               
        }
    }
}
