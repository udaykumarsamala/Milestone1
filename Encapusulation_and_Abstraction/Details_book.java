package Encapusulation_and_Abstraction;

public class Details_book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("Java");
       Author a=new Author("Uday","170031151@kluniversity.in",'M');
       b.setPrice();
       b.setQtyInStock();
       System.out.println("The name of the book is :"+b.getName());
       System.out.println("The price of the book is :"+b.getPrice());
       System.out.println("The stock is :"+b.getQtyInStock());
       b.getAuthor();
	}

}
class Author{
	static String name;
	static String email;
	static char gender;
	Author(String n,String e,char g){
		name=n;
		email=e;
		gender=g;
	}
	
}
class Book{
	String name,author;
	double price;
	int qtyInStock;
	Book(String n){
		name=n;
	}
	public String getQtyInStock() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPrice() {
		price=100;
	}
	public double getPrice() {
		return price;
	}
	public void setQtyInStock() {
		qtyInStock=10;
	}
	public String getName() {
		return name;
	}
	public void getAuthor() {
		System.out.println("The name of the author is :"+Author.name);
	       System.out.println("The email id is :"+Author.email);
	       System.out.println("The gender is :"+Author.gender);
	}
}

