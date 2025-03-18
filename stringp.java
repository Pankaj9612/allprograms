import java.util.Scanner;
class stringp{
public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter a String: ");
	String n=sc.next();
	String ori=n;
	String rev="";
	int len=n.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+n.charAt(i);	
	}
	if(ori.equals(rev))
	{
		System.out.println("String is palindrome");
	}
	else
	{
		System.out.print("String is not palindrome");
	}
    }
}
