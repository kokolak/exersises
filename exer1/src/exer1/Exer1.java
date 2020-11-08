package exer1;
import java.util.Scanner;
public class Exer1 
{

    public static void main(String[] args)
    {
      System.out.println("Give a number between 1 t0 10");
      Scanner sc=new Scanner(System.in);
      boolean elegxos = sc.hasNextInt();
      
      if(elegxos)
      {
       int number=sc.nextInt();
        if(number>=1 && number<=10)
         {
          System.out.println("Good!!!");
         }
         else
         {  
          System.out.println("Sorry give  number between 1 to 10!!!!");
         }
      }
        else
        {
          System.out.println("Please give a number no characters");
        }
    }
    
}
