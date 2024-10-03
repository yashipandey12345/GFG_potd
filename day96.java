class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(List<Integer> nums) {
        List<Integer> ans = new ArrayList<>();
        if (nums == null || nums.size() == 0) {
            ans.add(-1);
            return ans;
        }
        
        int candidate1 = -1, candidate2 = -1;
        int count1 = 0, count2 = 0;
        int n = nums.size();
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        
        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            }
        }
        
        if (count1 > n / 3) {
            ans.add(candidate1);
        }
        if (count2 > n / 3) {
            ans.add(candidate2);
        }
        if (ans.size() == 0) {
            ans.add(-1);
        }
        
        return ans;
    }
}
