package recursion2;
import java.util.Scanner;
public class Temp2 {
	public static void quickSort(int arr[], int si, int ei) {
		if (si >= ei) {
			return;
		}
		int pviot = partition(arr, si, ei);
		quickSort(arr, si, pviot - 1);
		quickSort(arr, pviot +  1, ei);
	}
	public static int partition(int arr[], int si, int ei) {
		int pviot = arr[si];
		int i = si, j = ei, count = 0;
		for (int k = si + 1; k < arr.length; k++) {
			if (arr[k] <= pviot) {
				count++;
			}
		}
		int pviotpos = si + count;
	    arr[si] = arr[pviotpos];
	    arr[pviotpos] = pviot;
	
	while (i < j) {
		while (arr[i] <= pviot && i < ei)
			i++;
		while (arr[j] > pviot)
			j--;
		if (i < j) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
		
	}
	return pviotpos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}

}
