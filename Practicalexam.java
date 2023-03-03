import java.util.Scanner;
class PracticalExam
{
 public static void main(String [] args)
 {
  Scanner in=new Scanner( System.in );
  int no;
  System.out.println ( " Enter any number " );
  no=in.nextInt();
   if (no>=0)
    System.out.println( " number is positive " );
   if (no<0)
    System.out.println( " number is negative " );
 }
}

