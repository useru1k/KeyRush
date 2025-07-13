package ui;

import java.util.List;
import java.time.*;

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

	public void displayFinal(int correctWord, int totalWords, Instant start, int correctChars, int totalChars ) {
		long time = Duration.between(start, Instant.now()).getSeconds();
		double wpm = correctWord / (time / 60.0);
		double acc = (double) correctChars * 100 / totalChars;

		System.out.println("Game Over!");
   		System.out.printf("Final WPM: %.2f\n", wpm);
     		System.out.printf("Accuracy : %.2f%%\n", acc);
	}

	public static void displayHeader(int correct, int total, Instant start, int correctChars, int totalChars) {
       		long seconds = Duration.between(start, Instant.now()).getSeconds();
        	seconds = (seconds == 0) ? 1 : seconds;
        	double wpm = (correct / (seconds / 60.0));
        	double acc = (totalChars == 0) ? 100.0 : ((double) correctChars / totalChars) * 100;

        	System.out.printf("     +--------------------+   +---------------------+     \n");
        	System.out.printf("     |  WPM: %-12.2f|   |  ACC: %-12.2f%%|     \n", wpm, acc);
        	System.out.printf("     +--------------------+   +---------------------+\n\n     ");
        	System.out.println("KeyRush CLI\n");
    }
}
