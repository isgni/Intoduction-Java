import java.util.Scanner;
class ForLoop4
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int no, f=1;
System.out.println("Enter any number");
no=in.nextInt();
for (int i=1; i <=no; i++)
{
f=f*i;
}
System.out.println("The factorial of "+no+" is "+f);
}
}