public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        if (A == null || B == null)
            return null;

        int C[] = new int[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while(i< A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            }
            else {
                C[k++] = B[j++];
            }
        }

        while(i < A.length)
            C[k++] = A[i++];
        
        while(j < B.length)
            C[k++] = B[j++];

        return C;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3,i;
        System.out.println("enter 1st array size and 2nd array size");
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=n1+n3;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(i=0;i<n1;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n2;i++)
            b[i]=sc.nextInt();
        int c[]=new int[n3];
        c=mergeSortedArray(a,b);
        for(i=0;i<n3;i++)
            System.out.print(c[i]);
        
        
    }
}
