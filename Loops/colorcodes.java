package Loops;

public class colorcodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=args[0].charAt(0);
		switch(c) {
		case 'r' :
		case 'R' :	
			System.out.println("Red");
			break;
		case 'g':
		case 'G' :
			System.out.println("Green");
			break;
		case 'b':
		case 'B' :
			System.out.println("Blue");
			break;
		case 'y':
		case 'Y' :
			System.out.println("Yellow");
			break;
		case 'o':
		case 'O' :
			System.out.println("Orange");
			break;
		case 'w':
		case 'W' :
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code");
	     
		}
		

	}

}
