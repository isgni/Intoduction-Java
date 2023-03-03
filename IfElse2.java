import java.util.Scanner;
class ifelse2
{
 public static void main(String [] args)
 {
  Scanner in=new Scanner( System.in );
  int no;
  System.out.println ( " Enter any number " );
  no=in.nextInt();
   //number exactly devided by 2 is called even
   if (no%2==0)
    System.out.println( " number is even " );
   else
    System.out.println( " number is odd " );
	}
}