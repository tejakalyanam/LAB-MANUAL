import java.util.Scanner;

class Grade {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);


		System.out.print("Enter marks : ");
		int m = input.nextInt();
		System.out.println("Entered marks are : " + m);

if ((m ==100)&&(m <= 90)) {
System.out.println("your grade is A");
}
else if ((m <=89)&&(m >= 80)) {
System.out.println("your grade is B");
}
else if ((m <=79)&&(m >= 70)) {
System.out.println("your grade is C");
}
else{
System.out.println("Error in marks");
}

}
}