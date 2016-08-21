import java.util.Scanner;
class Assignment8
{
 public static void main(String args[])
 {
  Scanner s = new Scanner(System.in);
  String a;
  System.out.print("Enter name of month or 'EXIT' : ");
  a = s.next();
  switch(a.toLowerCase())
   {
    case "january" : System.out.println("31 Days");
    break;
    case "february" : System.out.println("28 / 29 Days");
    break;
    case "march" : System.out.println("31 Days");
    break;
    case "april" : System.out.println("30 Days");
    break;
    case "may" : System.out.println("31 Days");
    break;
    case "june" : System.out.println("30 Days");
    break;
    case "july" : System.out.println("31 Days");
    break;
    case "august" : System.out.println("31 Days");
    break;
    case "september" : System.out.println("30 Days");
    break;
    case "october" : System.out.println("31 Days");
    break;
    case "november" : System.out.println("30 Days");
    break;
    case "december" : System.out.println("31 Days");
    break;
    default : System.out.println("invalid entry!");
    }
  }
}