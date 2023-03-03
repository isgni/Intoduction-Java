import java.util.Scanner;
class DoWhileLoop2
{
public static void main(String []args)
{
Scanner in=new Scanner(System.in);
int no, f=1, i=1;
System.out.println("Enter any number");
no=in.nextInt();
do
{
f=f*i;
i++;
}
while(i<=0);
System.out.println("The factorial of "+no+" is "+f);
}
}