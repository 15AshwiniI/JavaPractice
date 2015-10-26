import java.util.*; //not allowed to do this must import individually for 1331, otherwise its fine
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Set;

public class WordCount {
	private Map<String,Integer> wordCounts;
/*
* Write a program that reads in a file and counts the words in it.
*/
	//private Map<String,Int> WordCount = new Map<String,Int>();
	//private String username;
	
	public WordCount(String fileName) throws FileNotFoundException {
		//username = fileName;
		wordCounts = new HashMap<>();
		File file = new File(fileName);
		Scanner fileScanner = new Scanner(file);
		while(fileScanner.hasNext()){
			String word = fileScanner.next();
			if (wordCounts.containsKey(word)) {
				//Weve seen this word before
				int curCount = wordCounts.get(word);
				wordCounts.put(word,curCount + 1);
			} else {
				// we havnt seen it before
				wordCounts.put(word, 1);
			}
			//wordCounts.put(...);
		}
	}

	public Set<String> getWords() {
		TreeSet<String> sortedWords = new TreeSet<>();
		return wordCounts.keySet();
	}

	public int getCount(String word) {
		return wordCounts.get(word);
	}
}