class car {
//ATTRIBUTES
String car_color;
String car_brand;
String fuel_type;
int mileage;
//CONSTRUCTORS	
public car(String car_color,String car_brand,String fuel_type, int mileage){
	this.car_color = car_color;
	this.car_brand = car_brand;
	this.fuel_type = fuel_type;
	this.mileage = mileage;
}
// METHODS 
public void start() {
	System.out.println("The car is started");
}
public void stop() {
	System.out.println("The car is stopped");
}
public void service() {
	System.out.println("The car is in service");
}
public void details() {
	System.out.println("CAR DETAILS ");
	System.out.println("CAR COLOUR:" + car_color);
	System.out.println("CAR BRAND:" + car_brand);
	System.out.println("CAR FUEL TYPE:" + fuel_type);
	System.out.println("CAR MILEAGE:" + mileage);
}
//MAIN PROGRAM 
	public static void main(String[] args) {
	// Creating objects for class car
	car c1 = new car("WHITE","MCLAREN","PETROL",10);
	car c2 = new car("BLACK","BUGATTI","PETROL",8);
	car c3 = new car("BLUE","FERARI","PETTROL",15);
System.out.println("car 1 deatils");
 c1.details();
 c1.start();
 c1.stop();
 c1.service();
System.out.println("car 2 deatils");
 c2.details();
 c2.start();
 c2.stop();
 c2.service();

System.out.println("car 3 deatils");
 c3.details();
 c3.start();
 c3.stop();
 c3.service();

}
}
