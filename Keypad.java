package recursion2;
import java.util.Scanner;
public class Keypad {
	public static String[] keypad(int n, int v) throws Invalid_Input{
		if (n == 0) {
			String ans[] = {""};
			return ans;
		}
		String smallAns[] = keypad(n /10);
		char str[] = helper(n % 10);
		String ans[] = new String[smallAns.length * 3];
		int k = 0;
		for (int i = 0 ; i < smallAns.length; i++) {
			for (int j = 0; j < str.length; j++) {
				ans[k] = smallAns[i] + str[j];
				k++;
			}
		}
		return ans;
	}
	public static String[] keypad(int n)throws Invalid_Input{
		int k = n;
		while(n != 0) {
			if (n % 10 == 0) {
				Invalid_Input e = new  Invalid_Input();
				throw e;	
			}
			n /= 10;
		}
		return keypad(k, 1);
	}
	public static char[] helper(int n) {
		if (n == 2) {
			char arr[] = {'a', 'b', 'c'};
			return arr;
		}
		if (n == 3) {
			char arr[] = {'d', 'e', 'f'};
			return arr;
		}
		if (n == 4) {
			char arr[] = {'g', 'h', 'i'};
			return arr;
		}
		if (n == 5) {
			char arr[] = {'j', 'k', 'l'};
			return arr;
		}
		if (n == 6) {
			char arr[] = {'m', 'n', 'o'};
			return arr;
		}
		if (n == 7) {
			char arr[] = {'p', 'q', 'r'};
			return arr;
		}
		if (n == 8) {
			char arr[] = {'s', 't', 'u'};
			return arr;
		}
		if (n == 9) {
			char arr[] = {'v', 'w', 'x'};
			return arr;
		}
		char arr[] = {};
		return arr;	
	}
	public static void main(String[] args)throws Invalid_Input {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		String arr[] = keypad(n);
		for (int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
	}}
}
