package model;

public class GoalCard extends Card {
	public GoalCard(boolean gold) {
		if (gold) {
			this.name = 'G';
		} else {
			this.name = 'C';
		}
		
	}
}
