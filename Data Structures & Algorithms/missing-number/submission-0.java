class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum= n*(n+1)/2;
        int arsum=0;
        for(int i:nums){
            arsum+=i;
        }
        return sum-arsum;
        

    }
}
