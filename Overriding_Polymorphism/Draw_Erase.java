package Overriding_Polymorphism;

public class Draw_Erase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();

	}

}
class Shape {
	
	
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
	
}
class Circle extends Shape {

	public void draw() {
		System.out.println("Drawing Circle");
	}
	public void erase() {
		System.out.println("Erasing Circle");
	}
}
class Triangle extends Shape {

	public void draw() {
		System.out.println("Drawing Triangle");
	}
	public void erase() {
		System.out.println("Erasing Triangle");
	}
}
class Square extends Shape {

	public void draw() {
		System.out.println("Drawing Square");
	}
	public void erase() {
		System.out.println("Erasing Square");
	}
}
