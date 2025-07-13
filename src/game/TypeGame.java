package game;

import java.util.List;
import java.util.Scanner;
import ui.TerminalUI;
import java.time.Instant;

public class TypeGame {
	private final List<String> words;
	private final Scanner sc;
	public TypeGame() { 
		this.words = WordGenerator.gettingSentence();
		this.sc = new Scanner(System.in);
	}
	public void start() {
		TerminalUI view = new TerminalUI();
		// System.out.println("Starting the game"); checking 
		// System.out.println(words); checking
		// view.displayWords(words,2); checking
		
		int correctWords = 0, correctChars = 0, totalChars = 0;
		Instant start = Instant.now();

		for(int i=0;i<words.size();i++) {
			view.clear();
			view.displayHeader(correctWords,words.size(),start,correctChars,totalChars);
			view.displayWords(words,i);

			System.out.print("\nType:");

			String input = sc.nextLine().trim();

			String currentWord = words.get(i);

			totalChars += input.length();

			if(currentWord.equals(input)) {
				correctWords++;
				correctChars += input.length();
			}
			else {
				for(int j=0;j<Math.min(currentWord.length(),input.length());j++) {
					if(input.charAt(j) == currentWord.charAt(j)) correctWords++;
				}
			}
		}

		view.clear();
		view.displayFinal(correctWords,words.size(),start,correctChars, totalChars);
		System.out.println("BYe See You ");

	}
}
