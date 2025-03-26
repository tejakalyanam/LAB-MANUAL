class book {

//ATTRIBUTES

String title;
String author;
int y_o_p;

//CONSTRUCTORS
public book(String title, String author, int y_o_p){
	this.title = title;
	this.author = author;
	this.y_o_p = y_o_p;
}

//METHODS 
public void display() {
	System.out.println("Book title :" + title);
	System.out.println("Book author is:" + author);
	System.out.println("Year of publication is :" + y_o_p);
}

// MAIN PROGRAM
public static void main(String[] args) {
	
//CREATING OBJECT FOR BOOK CLASS
	book b1 = new book("OS","unknown",1997);
	book b2 = new book("KERENAL","unknown",1968);

//CALLING METHODS
	System.out.println("Book 1 details");
	b1.display();
	System.out.println("	");
	System.out.println("Book 2 detals");
	b2.display();
}
}	