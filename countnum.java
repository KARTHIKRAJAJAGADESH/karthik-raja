import java.util.*;
import java.util.Scanner;
import java.io.*;   
  public class countnumber {
      public static void main (String[] args) {
          Scanner input = new Scanner(System.in);
          int n,total=0;
          int numbers;
          int count;
          int counter=0;
          
          {
          while (counter < 15){
              numbers = input.nextInt();
              total = total + numbers;
              counter++;
          }
          count = total;
          System.out.println("the sum of count is "+ count);
          }
      }
  }
