import java.util.*;
public class WordCount {

	private Map<String,Int> WordCount = new Map<String,Int>();
	private String username;
	
	public WordCount(String fileName) {
		username = fileName;
	}

	public void count words() {
		File userFile = new File(fileName+ ".csv");
		Scanner in = new Scanner(userFile).useDelimiter(Pattern.compile("[,\\n]"));
	}
}