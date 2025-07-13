package game;

import java.util.List;

public class TypeGame {
	private final List<String> words;
	public TypeGame() { 
		this.words = WordGenerator.gettingSentence();
	}
	public void start() {
		System.out.println("Starting the game");
		System.out.println(words);
	}
}
