package recursion2;
import java.util.Scanner;
public class Quick_Sort {
	public static void quickSort(int arr[], int si, int ei) {
		if (si >= ei)
			return;
		int pivotpos = partition(arr, si, ei);
		quickSort(arr, si, pivotpos - 1);
		quickSort(arr, pivotpos + 1, ei);
	}
	
	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[si];
		int i = si, j = ei;
		while(i < j) {
			while(arr[i] <= pivot && i < ei) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if ( i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		arr[si] = arr[j];
		arr[j] = pivot;
		return j;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr, 0, arr.length - 1);
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
