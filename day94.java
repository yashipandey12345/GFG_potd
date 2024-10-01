class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        long num1 = 0;
        long num2 = 0;
        int mod = 1000000007;
        while (first != null) {
            num1 = (num1 * 10 + first.data) % mod;
            first = first.next;
        }
        while (second != null) {
            num2 = (num2 * 10 + second.data) % mod;
            second = second.next;
        }
        long result = (num1 * num2) % mod;
        return result;
    }
}