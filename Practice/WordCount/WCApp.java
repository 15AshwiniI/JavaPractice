import java.io.FileNotFoundException;

public class WCApp {

	public static void main(String[] args) throws FileNotFoundException {

		WordCount wc = new WordCount(args[0]);

		for(String word: wc.getWords()) {
			System.out.printf("%s: %d%n", word, wc.getCount(word));
		}

	}
}