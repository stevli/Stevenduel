package duel;

public class CharacterA implements Dueler{
	int hp;
	public CharacterA() {	
	}
	public void taunt() {
		System.out.println("You Suck.");
	}
	public String getName() {
		return "Bob";
	}
	public void setStartingHP(int hp) {
		this.hp=hp;
	}
	public int getHP() {
		return hp;
	}
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP()==hp) 
			return true;
		return false;
	}
}
