package Class_Objects;

public class Health_Care {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Patient p=new Patient(10,20);
System.out.println("The BMI "+p.computeBMI());
	}

}
class Patient{
	String name;
	double height,weight;
	Patient(double h,double w){
		height=h;
		weight=w;
	}
	double computeBMI() {
		return (weight/(height*height));
		
	}
}