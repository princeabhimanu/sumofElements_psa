class PrefixSum {
    public static int rangeSum(int[] arr, int L, int R) {
        int[] prefix = new int[arr.length + 1];
        
        // Compute prefix sum
        for (int i = 0; i < arr.length; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        
        // Return sum of range [L, R]
        return prefix[R + 1] - prefix[L];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int L = 1, R = 3;
        
        System.out.println("Sum in range [" + L + ", " + R + "] = " + rangeSum(arr, L, R));
    }
}
