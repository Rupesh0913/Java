import java.lang.*;
class key{
    static boolean findKey(int N, int[] arr,int x, int k)
    {
        int i;
        boolean b = false;
    
        for (i = 0; i < N; i = i + k) {

            for (int j = 0; j < k; j++) {
                if (i + j < N && arr[i + j] == x)
                    break;
 
                if (j == k)
                    return false;
                if (i + j >= N)
                    return false;
            }
        }
        if (i >= N)
            return true;
        else
            return b;
    }
 
    // Driver Code
    public static void main(String args[])
    {
        int arr[] = new int[] { 5, 8, 7, 8, 14, 8, 9 ,8};
        int x = 12, k = 2;
        int n = arr.length;
        if (findKey(n, arr, x, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}