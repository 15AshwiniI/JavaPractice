
public class palindrome {
	public boolean palindrome(String a) {
		a = a.toLowerCase();
		for(int i = 0; i < a.length(); i++) {
			if (a.substring(i,i+1).equals(" ") ){
				a = a.substring(0,i) + a.substring(i+1);
				//System.out.println(a);
			}
			if ( ! (((a.charAt(i) <= 90) && (a.charAt(i) >= 65)) || ((a.charAt(i) <= 122) && (a.charAt(i) >= 97)) )) {
				a = a.substring(0,i) + a.substring(i+1);
				//System.out.println(a);
			}
		}
		for(int i = 0; i < a.length()/2; i++) {
			if (!a.substring(i,i+1).equals(a.substring(a.length()-i-1, a.length() -i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		palindrome p = new palindrome();
		System.out.println(p.palindrome("hannah"));
		System.out.println(p.palindrome("hi"));
		System.out.println(p.palindrome("han5nah"));
		System.out.println(p.palindrome("Now ,ord,nobond,rowon"));
	}
}