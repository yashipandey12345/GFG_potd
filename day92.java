class Solution {
    int totalCount(int k, int[] arr) {
        int total = 0;
        
        for (int num : arr) {
            // Calculate how many parts are needed for num
            total += (num + k - 1) / k; // This is equivalent to Math.ceil(num / k)
        }
        
        return total;
    }
}
