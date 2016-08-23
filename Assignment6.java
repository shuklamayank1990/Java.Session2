class Assignment6
{
 public static void main(String args[])
 {
  int a,b,c,d;
  for(a=1;a<=100;a++)
   {
    d=0;
    for(b=2;b<a;b++)
     {
       if(a%b==0)
        {  
         d=1;
         break;
        } 
     }
    if(d==0)
    System.out.println(a+" ");
    }
  }
}