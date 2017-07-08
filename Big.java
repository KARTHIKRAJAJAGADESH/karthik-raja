import java.util.*;
import java.io.*;
public class Largest{
  public static void main(String args[])throws IOException 
  {
    int a,b,c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    if(a>=b && a>=c) 
{
System.out.println("Largest number: "+a);
}
if(b>=a && b>=c) 
{
System.out.println("Largest number: "+b);
}
if(c>=a && c>=b) 
{
System.out.println("Largest number: "+c);
}
}
}
