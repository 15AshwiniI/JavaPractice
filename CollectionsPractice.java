import java.util.ArrayList;
public class CollectionsPractice {

	public CollectionsPractice() {

	}

	public void ArListPractice() {
		/*
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("hi");
		alist.add("bye");
		for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		alist.remove("bye");for(int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		*/
		ArrayList tasks = new ArrayList();
		tasks.add("Eat");
		tasks.add("Sleep");
		tasks.add("Code");

		for (Object task: tasks) {
			System.out.println(task);
		}
	}

	public static void main(String[] args) {
		CollectionsPractice cp = new CollectionsPractice();
		cp.ArListPractice();
	}
}