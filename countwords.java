import java.util.*;
import java.io.*;
public class Countwords
{ 
  public static void main(String args[]) throws IOException
  { 
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s = br.readLine();
 
    int count = 1;
 
    for (int i = 0; i < s.length() - 1; i++)
    {
      if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
      {
        count++;
 
      }
    }
    System.out.println("Number of words in a string = " + count);
  }
}
        
  
