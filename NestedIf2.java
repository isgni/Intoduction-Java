import java.util.Scanner;
class nestedif2
{
 public static void main(String [] args)
 {
  Scanner in=new Scanner(System.in);
  int a , b , c;
  System.out.println(" Enter three number ");
  a=in.nextInt();
  b=in.nextInt();
  c=in.nextInt();
  if(a>b)
     if(a>c)
	     System.out.println(a+ " greater ");
  if(b>a)
    if(b>c)
	    System.out.println(b+ " is greater ");
  if(c>a)
    if(c>b)
	     System.out.println(c+ " is greater ");
 }
}