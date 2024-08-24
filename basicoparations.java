import java.util.Scanner;
public class basicoparations {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();
        System.out.println("Enter Your Operator to perform Basic Operation");
        char oparation=sc.next().charAt(0);
        double result=0;
        switch(oparation)
        {
            case '+':
               result=num1+num2;
               System.out.println("Addition of two Numbers:"+result);
               break;
            case '-':
               result=num1+num2;
               System.out.println("Subtraction of two Numbers:"+result);
               break;
            case '*':
               result=num1+num2;
               System.out.println("Multiplication of two Numbers:"+result);
               break;
            case '/':
               if(num2>0)
               {
               result=num1+num2;
               System.out.println("Division of two Numbers:"+result);
               }
               else
               {
               System.out.println("Division by Zero is undefined");
               }
               break;
            default:
               System.out.println("Invalid oparation");
               break;
        }
    }
    
}
