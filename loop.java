class Main {
  public static void main(String[] args) {
      
    int sum = 0;
    int n = 10;

    for (int i = 1; i <= n; i=i+2) {
	sum += i; 
    }
       
    System.out.println("Sum = " + sum);
  }
}
