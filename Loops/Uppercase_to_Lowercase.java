package Loops;

public class Uppercase_to_Lowercase {
	public static void main(String[] args) {
		char c='a';
		char c1;
		if(c>='A'&& c<='Z')
			c1=Character.toLowerCase(c);
		else
			c1=Character.toUpperCase(c);
		
		System.out.println(c+" ->"+c1);
	  
}
}