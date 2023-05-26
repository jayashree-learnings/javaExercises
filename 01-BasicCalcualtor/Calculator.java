

class Calculator
{
    public int addNums(int num1, int num2)
        {
            int result = num1 + num2;
            return result;
        }
    public int subtractNums(int num1, int num2)
        {
            int result = num1-num2;
            return result;
        }
    public int multiplyNums(int num1,int num2)
        {
            int result = num1*num2;
            return result;
        }
    public int divideNums(int num1,int num2)
        {
            int result = num1/num2;
            return result;
        }
    public void resultDisplay(int result)
        {
        String answer = "The result is ";
        String concat_answer = answer + result ;
        System.out.println(concat_answer);
        }
}









