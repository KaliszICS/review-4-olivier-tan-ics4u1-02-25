import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an Integer: ");
		String words = in.nextLine();
		words = "5" + words;
		System.out.println(Integer.parseInt(words)+5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num = in.nextLine();
		num = "4" + num + "3";
		System.out.println(Double.parseDouble(num)+3.4);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.println("Input a boolean: ");
		String bool = in.nextLine();
		System.out.println(!Boolean.parseBoolean(bool));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String words = in.nextLine();
		words = words + "3";
		int num = Integer.parseInt(words+2);
		System.out.println((char)num);
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String words = in.nextLine();
		words = words + "1";
		int num = Integer.parseInt(words)/2;
		System.out.println((double)num);
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String words = in.nextLine();
		words = "1" + words;
		double dou = Double.parseDouble(words);
		System.out.println((int)dou);
	}

}
