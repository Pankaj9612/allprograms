import java.util.Scanner;
class digit{
public static void main(String args[])
{
 
 Scanner sc = new Scanner(System.in);
 System.out.println("enter a number: ");
 int n=sc.nextInt();
 int count=0;
 while(n>0)
{
 int lastdigit=n%10;
 count=count+1;
 n=n/10;
}
 System.out.println(count);
}

}