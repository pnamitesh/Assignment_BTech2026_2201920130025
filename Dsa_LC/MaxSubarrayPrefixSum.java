public class MaxSubarrayPrefixSum {
    public static void maxSubarraySum(int[] n) {
        if (n == null || n.length == 0) return; // Guard condition for empty or null arrays

        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[n.length];
        
        // Initialize the first element of the prefix sum array
        prefix[0] = n[0];
        maxSum = Math.max(maxSum, prefix[0]);
        
        // Calculate the prefix sum array
        for (int i = 1; i < n.length; i++) {
            prefix[i] = prefix[i - 1] + n[i];
            maxSum = Math.max(maxSum, prefix[i]); // Update maxSum during prefix sum calculation
        }
        
        // Find the maximum subarray sum using the prefix sum array
        for (int i = 0; i < n.length; i++) {
            for (int j = i; j < n.length; j++) {
                int currentSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        System.out.println("Maximum sum: " + maxSum);
    }
    
    public static void main(String[] args) {
        int[] num = {2, 4, -11, 8, 10};
        maxSubarraySum(num);
    }
}
