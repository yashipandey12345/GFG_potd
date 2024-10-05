class Solution {
    public long findSmallest(int[] arr) {
        long smallestPositive = 1; // Start with the smallest positive integer

        // Iterate through the sorted array
        for (int num : arr) {
            // If the current number is greater than smallestPositive,
            // we cannot form smallestPositive with the current or any future elements
            if (num > smallestPositive) {
                break; // We found the gap
            }
            // Otherwise, we can form all sums up to smallestPositive + num
            smallestPositive += num;
        }

        return smallestPositive; // Return the smallest positive integer not formable
    }
}
