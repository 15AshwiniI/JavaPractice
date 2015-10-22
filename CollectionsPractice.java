import java.util.*;

public class CollectionsPractice {

	public CollectionsPractice() {

	}

	public void ArListPractice() {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hi");
		alist.add("bye");
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		alist.remove("bye");for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		/*
		ArrayList tasks = new ArrayList();
		tasks.add("Eat");
		tasks.add("Sleep");
		tasks.add("Code");

		for (Object task: tasks) {
			System.out.println(task);
		}
		*/
	}

	public void SetPractice() {
		List<String> nameList = Arrays.asList("Alan", "Ada", "Alan");
		Set<String> nameSet = new HashSet<>(nameList);
		System.out.println("nameSet: " + nameSet);
	}

	public static void main(String[] args) {
		CollectionsPractice cp = new CollectionsPractice();
		cp.ArListPractice();
		cp.SetPractice();
	}
}