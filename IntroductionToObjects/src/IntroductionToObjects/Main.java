package IntroductionToObjects;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// sc.next();
		int x = 5;
		String h = "hello";
		h.length();
		
		tim("Timmmmmmmmmm!", 4);
		System.out.println(add2(6));
		System.out.println(str("hi"));
	}

	public static void tim(String str, int x) {
		for(int i = 0; i < x ; i++) {
			System.out.println(str);	
		}
	}
	
	public static int add2(int x) {
		return x + 2;
	}
	
	public static String str(String x) {
		return String.format("%s!", x);
	}
}
