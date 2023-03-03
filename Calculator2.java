import java.util.Scanner;

class Calculator2
{
public static void main(String[] args)
{
Scanner scan=new Scanner(system.in);
int x;
int y;

System.out.print("input first number: ");
x = scan.nextInt();

System.out.print("input second number: ");
y = scan.nextInt();

int sum = x+y;
int diff = x-y;
int pro = x*y;
int div = x/y;
int mod = x%y;

System.out.println(x + " + " + y + " = " + sum);
System.out.println(x + " - " + y + " = " + diff);
System.out.println(x + " x " + y + " = " + pro);
System.out.println(x + " / " + y + " = " + div+"."+mod);
}
}
