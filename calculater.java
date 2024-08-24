import java.util.Scanner;
public class calculater {
    public static void main(String [] ags)
    {
        Scanner cs=new Scanner(System.in);
        System.out.println("--------Basic Calculater------------");
        String[][] i={{"         ","C","x"," ","/"}, {"         ","7","8","9","+"},{"         ","4","5","6","-"},{"         ","1","2","3","*"},
        {"         ","%","0",".","="}};
        for(int j=0;j<i.length;j++)
        {
            for(int k=0;k<i[j].length;k++)
            {
                System.out.print(i[j][k]+"  ");
            }
            System.out.println();
        }
          System.out.println("-----------------------------------");  
           
            
            boolean exit=false;
            boolean operation=true;
            double result=0;
            while (!exit) {
                if (operation) {
                System.out.println("Enter the first number:");
                result = cs.nextDouble();
                    operation = false;
                }
                System.out.println("Enter an operation (+, -, *, /, %) or 'x || X' to exit:");
                char symbol=cs.next().charAt(0);
           
                if (symbol == 'x' || symbol == 'X') {
                    exit = true;
                   System.out.println("Exiting the calculator. Goodbye!");
                    break;
                
            }
            System.out.println("Enter the Next Number");
            double num=cs.nextDouble();
           
          switch(symbol)
          {
            case '+':
                result+=num;
                break;
            case '-':
                result-=num;
                break;
            case '*':
                result*=num;
                break;
            case '/':
                if(num>0)
                result/=num;
                else
                System.out.println("Divisible by 0 is Not Valid");
                break;
            case '%':
               
                result=result*(num/100);
                break;
            default:
                System.out.println("You Enter the Invalid Inputs");
                break;
          }
        
          System.out.println(result);
        }
        
    }

 }
    
    
