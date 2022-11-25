package fundamentals;
import java.util.Scanner;


public class TakingInput {

	public static void main(String[] args) {
		 
		int a,b;
		Scanner s= new Scanner(System.in);
		a= s.nextInt();
		b= s.nextInt();
		int c= a+b;
		System.out.println(c);
		String str = s.next();
		System.out.println(str);
//		System.out.println(str);
		
		// TODO Auto-generated method stub
//		String str = s.next();
//		int a = s.nextInt();
//		System.out.print(str + " " + a);

	}

}
