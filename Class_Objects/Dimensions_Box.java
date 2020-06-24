package Class_Objects;

public class Dimensions_Box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box(10,20,30);
		Box b2=new Box(40,50,60);
		double volume;
		volume=b1.volume();
		System.out.println("The volume of the First Box is "+volume);
		volume=b2.volume();
		
		System.out.println("The volume of the Second Box is "+volume);
	}

}
class Box{
	double width;
	double height;
	double depth;
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	double volume() {
		return width*height*depth;
	}
}