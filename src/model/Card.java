package model;

public abstract class Card {
	protected char name;
	
	public Card() {
		this.name = '0';
	}
	
	public void display() {
		System.out.print(name);
	}
}
