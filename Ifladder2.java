import java.util.Scanner;
class ifladder2
{
 public static void main(String [] args)
 {
  Scanner in=new Scanner(System.in);
  float p;//declaring variable for percent
  System.out.println(" Enter your percent ");
  p=in.nextFloat();
  if(p>=60)
   System.out.println(" First div ");
  else if (p>=45)
   System.out.println(" Second div ");
  else if (p>=33)
   System.out.println(" Third div ");
  else
   System.out.println(" Sorry!! you are fail!!");
  }
 }