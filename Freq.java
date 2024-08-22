//the prg to check the frequency of a given character in a string
import java.util.Scanner;//importing scanner class
public class Freq
{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the string");//string receving from user
     String str=sc.nextLine();//string accessing from memory
     int len=str.length();//finding string length
     int count=0;//initializing count as 0
     System.out.println("enter the character to check the frequency");//print statement for receving character
     char ch=sc.nextLine().charAt(0);//initializing character ch at first position
     for (int i=0;i<len;i++)//loop working
     {
        if (str.charAt(i)==ch)
        {
           count++;
        }
     }
     System.out.println("the occurence of the character "+ch+" in "+str+ " ="+count);//printing the occurence of the character
   }
}
