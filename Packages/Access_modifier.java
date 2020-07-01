package Packages;

class Foundation {
	private int Var1;
	int Var2;
	protected int Var3;
	public int Var4;
}
public class Access_modifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Foundation foundation = new Foundation();

		foundation.Var4 = 5;
		
		System.out.println(foundation.Var4);

	}

}
