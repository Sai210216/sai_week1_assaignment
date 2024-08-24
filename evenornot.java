import java.util.Scanner;
class Evenornot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenOrnot(n);
    }
    static void evenOrnot(int n)
    {
        if(n%2==0)
        System.out.println("Given Number is Even");
        else
        System.out.println("Given Number is Not Even");
    }
}
    

