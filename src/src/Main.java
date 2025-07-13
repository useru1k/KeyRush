import java.util.Scanner;
import game.TypeGame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TypeGame game = new TypeGame();
		game.start();
		sc.close();
	}
}
