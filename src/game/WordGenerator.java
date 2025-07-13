package game;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordGenerator {
	public WordGenerator() {
	}
	public static List<String> gettingSentence() {
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
		String result[] = randomWord.get(random.nextInt(randomWord.size())).split(" ");
		List<String> resultLine = new LinkedList<>();
		for(int i=0;i<result.length;i++) {
			resultLine.add(result[i]);
		}
		// System.out.println(resultLine);
		return resultLine;
	}
}
