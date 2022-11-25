package fundamentals;
import java.util.Scanner;
public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner(System.in);
String str =s.next();
char ch = str.charAt(0);
//System.out.println(ch);
int a= s.nextInt();
int b= s.nextInt();
int c= s.nextInt();
int d = (a+b+c)/3 ;
System.out.println(ch);
System.out.println(d);

	}

}
