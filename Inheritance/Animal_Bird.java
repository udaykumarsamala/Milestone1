package Inheritance;

public class Animal_Bird {
 public static void main(String [] args) {
	 Animal a = new Animal();
	 Bird b = new Bird();
	 a.eat();
	 a.sleep();
	 b.eat();
	 b.sleep();
	 b.fly();
	 
 }
}
class Animal
{
void eat()
{
System.out.println("Animal Eat Method");
}
void sleep()
{
System.out.println("Animal Sleep Method");
}
}
class Bird extends Animal
{
void eat()
{
System.out.println("Bird Eat Method");
}
void sleep()
{
System.out.println("Bird Sleep Method");
}
void fly()
{
System.out.println("Bird Fly Method");
}
}


