package Interfaces;

interface Playable {
	public void play();
}

class Veena implements Playable {

	
	public void play() {
		System.out.println("Playing Veena");

	}

}
class Saxophone implements Playable {

	
	public void play() {
		System.out.println("Playing Saxophone");

	}

}
public class music {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playable veena = new Veena();
		veena.play();
		
		Playable saxophone = new Saxophone();
		saxophone.play();

	}

}
