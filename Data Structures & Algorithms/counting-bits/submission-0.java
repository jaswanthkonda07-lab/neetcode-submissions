class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=countone(i);
        }
        return arr;
    }
}
    public int countone(int m){
        int count=0;
        while(m!=0){
            if((m&1)==1){
                count++;
            }
            m=m>>>1;
        }
        return count;
    }

