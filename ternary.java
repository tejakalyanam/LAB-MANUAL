import java.util.Scanner;

class ternary {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);

		System.out.print("Enter  a value : ");
		int a = input.nextInt();
		System.out.print("Enter  b value : ");
		int b = input.nextInt();
		System.out.print("Enter  c value : ");
		int c = input.nextInt();

		String result = ( a > b) ? "a is big" : "b is big";
		System.out.println("The biggest value among a & b is :" + result);
		input.close();
  }
}   