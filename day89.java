class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        // int maxele = arr[0];
        int maxicount = 0;
        int count = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                // maxele = arr[i];
                count++;
                maxicount = Math.max(count,maxicount);
            }
            else{
                count = 0;
            }
        }
        return maxicount;
    }
}
