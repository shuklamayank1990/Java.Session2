import java.util.Scanner;
class Assignment5
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  int a;
  System.out.print("Enter your age:");
  a = s.nextInt();
  if(a<18)
  System.out.println("Not elligible to vote");
  else 
  System.out.println("Elligible to vote");
  }
}