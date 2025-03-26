import java.util.Scanner;

class Input {
public static void main(String[] args)   {

Scanner input = new Scanner(System.in);

System.out.print("Enter principle amount :");
int p = input.nextInt();
System.out.println("Principal amount is "+ p);
System.out.print("Enter time (in years) :");
int t = input.nextInt();
System.out.println("The time is "+ t);
System.out.print("Enter Rate of interest :");
float r = input.nextFloat();
System.out.println("The Rate of interest is "+ r);


System.out.print("The simple interest is :" +  ((p*t*r)/100) );

}
}