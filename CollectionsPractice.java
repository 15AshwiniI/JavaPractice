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
	}

	public void SetPractice() {
		List<String> nameList = Arrays.asList("Alan", "Ada", "Alan", "Ashwini", "Ashwini");
		System.out.println("nameList: " + nameList);
		Set<String> nameSet = new HashSet<>(nameList);
		System.out.println("nameSet: " + nameSet);
	}

	public void MapPractice() {
		Map<String, String> capitals = new HashMap<>();
		capitals.put("Georgia", "Atlanta");
		capitals.put("Alabama", "Montgomery");
		capitals.put("Florida", "Tallahassee");
		capitals.put("California", "Sacramento");
		for (String state: capitals.keySet()) {
			System.out.println("Capital of " + state + " is "
			+ capitals.get(state));
		}
	}

	public void hashMapPracice() {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Peanut Butter"," and Jelly");
		hm.put("Salt"," and Pepper");
		System.out.println("hm: "+ hm);
		hm.remove("Salt");
		System.out.println("hm new: "+ hm);

	}

	public static void main(String[] args) {
		CollectionsPractice cp = new CollectionsPractice();
		cp.ArListPractice();
		cp.SetPractice();
		cp.MapPractice();
		cp.hashMapPracice();
	}
}