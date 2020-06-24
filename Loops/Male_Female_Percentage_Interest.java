package Loops;

public class Male_Female_Percentage_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[1]);
		if(args[0].equals("Male")) {
			if(a>=1 && a<=58) {
				System.out.println("Gender: "+args[0]+" age: "+args[1]+" Intrest:18.4%");
			}
			else
				System.out.println("Gender: "+args[0]+" age: "+args[1]+" Intrest:10.5%");
			
		}

		else if(args[0].contentEquals("Female")) {
			if(a>=1 && a<=58)
				System.out.println("Gender: "+args[0]+" age: "+args[1]+" Intrest:8.2%");
			else
				System.out.println("Gender: "+args[0]+" age: "+args[1]+" Intrest:9.2%");
		}
	}

}
