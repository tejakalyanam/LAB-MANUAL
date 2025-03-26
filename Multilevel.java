class calculator {
    
    public void add(int a , int b) {
        System.out.println("Addition is :" + (a + b));
    }

    public void sub(int a , int b) {
        System.out.println("Subtraction is :" + (a - b)); 
    }
}
class cal1 extends calculator {
    public void mul(int a, int b) {
        System.out.println("Multiplication is :" + (a * b));
    }
}
class cal2 extends cal1 {
    public void div(int a ,int b) {
        if (b > 0 ) {
            System.out.println("Division is :" + (a / b));
        } else {
            System.out.println("Denominator should be greater than zero");
        }
}
}
public class Multilevel {
    public static void main(String[] args) {
        cal2 c1= new cal2();
        c1.add(10, 20);
        System.out.println("");
        c1.sub(20, 10);
        System.out.println("");
        c1.mul(10, 20);
        System.out.println("");
        c1.div(20,10);
}
}
