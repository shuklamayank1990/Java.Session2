class Assignment7
{
 public static void main(String[] args)
 {
  int a,b;
  for(a=1;a<=5;a++)
   {
     for(b=1;b<=a;b++)
      {
       System.out.print(b);
      }
     System.out.println(" ");
    }
   a--;
   while(a>1)
   {
    a--;
    for(b=1;b<=a;b++)
     {
       System.out.print(b);
      }
     System.out.println(" ");
    }
}
}