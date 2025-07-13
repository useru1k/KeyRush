package ui;

import java.util.List;

public class TerminalUI {
	public void clear() {
		System.out.println("\033[H\033[2J"); /* ANSI Escape Code */
		System.out.flush();
	}
	public void displayWords(List<String> words, int currentIndex) {
		for(int i=0;i<words.size();i++) {
			if(i == currentIndex) {
				System.out.print("\033[1;32m" + words.get(i) + "\033[0m ");
			}
			else {
				System.out.print(words.get(i));
			}
		}
	}
}
