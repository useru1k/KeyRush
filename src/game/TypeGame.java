package game;

import java.util.List;
import java.util.Scanner;
import ui.TerminalUI;

public class TypeGame {
	private final List<String> words;
	private final Scanner sc;
	public TypeGame() { 
		this.words = WordGenerator.gettingSentence();
		this.sc = new Scanner(System.in);
	}
	public void start() {
		TerminalUI view = new TerminalUI();
		System.out.println("Starting the game");
		System.out.println(words);
		view.displayWords(words,2);
	}
}
