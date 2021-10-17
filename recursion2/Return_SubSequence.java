package recursion2;
import java.util.Scanner;

public class Return_SubSequence {
	public static String[] subSequence(String str) {
		if (str.isEmpty()) {
			String ans[] = {""};
			return ans;
		}
		String smallans[] = subSequence(str.substring(1));
		String ans[] = new String[2 * smallans.length];
		for (int i = 0; i < ans.length; i++) {
			if (i < smallans.length) {
				ans[i] = smallans[i];
			}
			else {
				ans[i] = str.charAt(0) + smallans[i - smallans.length];
			}
		}
		return ans;
		
		
	}

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		String str = sc.nextLine();
		String arr[] = subSequence(str);
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);


	}

}
