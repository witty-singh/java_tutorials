public class Solution {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        if (B == null || A == null)
            return null;

        int C[] = new int[A.length + B.length];

        int j = 0; int k = 0; int i = 0;

        while(i< A.length && j < B.length) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            }
            else 
                C[k++] = B[j++];
        }

        while(i < A.length)
            C[k++] = A[i++];
        
        while(j < B.length)
            C[k++] = B[j++];

        return C;
    }
}
