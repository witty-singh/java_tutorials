package recursion2;
import java.util.Scanner;

public class Merge_Sort {
	public static void mergeSort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int mid = (si + ei) / 2;
		mergeSort(arr, si ,mid);
		mergeSort(arr, mid + 1, ei);
		merge(arr, si, ei);
		
	}
	public static void merge(int arr[], int si, int ei) {
		int mid = (si + ei) / 2;
		int ans[] = new int[ei - si + 1];
		int i = si, j = mid + 1;
		int k = 0;
		while(i <= mid && j <= ei) {
			if(arr[i] < arr[j]) {
				ans[k] = arr[i];
				i++;
				k++;
			}
			else {
				ans[k] = arr[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			ans[k] = arr[i];
			i++;
			k++;
		}
		while (j <= ei) {
			ans[k] = arr[j];
			j++;
			k++;
		}
		for(i = 0; i < ans.length; i++) {
			arr[si + i] = ans[i];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		mergeSort(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		

	}

}
