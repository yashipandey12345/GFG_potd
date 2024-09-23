class Solve {
    int[] findTwoElement(int arr[]) {
        int n = arr.length;
        int repeating = -1, missing = -1;

        // Step 1: Find the repeating number
        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1; // Use the absolute value

            if (arr[index] < 0) {
                // If it's negative, we found the repeating number
                repeating = Math.abs(arr[i]);
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }

        // Step 2: Find the missing number
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                // The index + 1 is the missing number
                missing = i + 1;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}
