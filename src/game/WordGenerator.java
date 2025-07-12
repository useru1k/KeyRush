package game;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordGenerator {
	// private static final String[] WORDS = {
        // "son", "defense", "systems", "production", "failure", "manner", 
        // "potential", "man", "either", "series", "world", "logic", "java", 
        // "engine", "secure", "network", "typing", "keyboard"
    // };

	public static void gettingSentence() {
		List<String> randomWord = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader("words.txt"))) {
		String line;
		while((line = reader.readLine()) != null) {
			randomWord.add(line);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		String result = randomWord.get(random.nextInt(randomWord.size()));
		// System.out.println(randomWord);
		System.out.println(result);
		return;
	}

	public static void main(String[] args) { 
		List<String> wordList = new ArrayList<>();
		Random randomWords = new Random();
		for(int i=0;i<10;i++) {
			wordList.add(WORDS[randomWords.nextInt(WORDS.length)]);
		}
		System.out.println(wordList);
		gettingSentence();
	}
}
