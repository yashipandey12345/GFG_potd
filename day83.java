class Solution {
    
    public int countBuildings(int[] height) {
        int count = 0;
        int maxHeight = 0; // Track the maximum height seen so far

        for (int h : height) {
            
            if (h > maxHeight) {
                count++;                     maxHeight = h;
            }
        }
        
        return count; 
    }
}
