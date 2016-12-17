package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import model.Card;
import model.GoalCard;
import model.StartCard;


public class Game {
	public static final int ROWS = 5;
	public static final int COLUMNS = 9;
	
	private Card board[][];
	
	public Game() {
		board = new Card[ROWS][COLUMNS];
		setBoard();
		
	}
	
	public void setBoard() {
		for (int i=0; i<ROWS; i++) {
			for (int j=0; j<COLUMNS; j++) {
				board[i][j] = new Card() {};
			}
		}
		board[2][0] = new StartCard();
		
		List<Card> goals = new ArrayList<Card>();
		goals.add(new GoalCard(true));
		goals.add(new GoalCard(false));
		goals.add(new GoalCard(false));
		Collections.shuffle(goals, new Random());
		
		for (int i=0; i<ROWS; i+=2) {
			board[i][COLUMNS-1] = goals.remove(0);
		}
	}
	
	public void displayBoard() {
		for (int i=0; i<ROWS; i++) {
			for (int j=0; j<COLUMNS; j++) {
				board[i][j].display();
			}
			System.out.println();
		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		game.displayBoard();
	}

}
