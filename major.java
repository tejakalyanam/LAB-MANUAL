import java.util.Scanner;

class major {
	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);

		System.out.print("Enter age : ");
		int age = input.nextInt();
		System.out.println("Entered age is : " + age);

	if (age >=18) {
	System.out.print("You are major "); 
	}
	else {
	System.out.print("You are minor "); 
	}
  }
}



