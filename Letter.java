import java.util.*;
import java.io.*;
import java.util.Scanner;

public class Letter{
  public static void main(String args[])throws IOException{
    char ch;
    //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter the character");
    
    ch = scan.next().charAt(0);
    
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print(ch + " is an Alphabet");
        }
        else
        {
            System.out.print(ch + " is not an Alphabet");
        }
    }
}
