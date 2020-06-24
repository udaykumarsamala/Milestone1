package Loops;

public class single_line_separated_by_comma {
public static void main (String args[]) {
	int k=args.length;
	if(k==0) {
		System.out.print("No Values");
	}
	else {
		System.out.print(args[0]);
		for(int i=1;i<k;i++) {
			System.out.print(","+args[i]);
		}
	}
}
}
