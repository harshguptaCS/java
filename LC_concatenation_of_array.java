class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int a[]=new int[n*2];
        for(int i=0;i<n;i++){
            a[i]=a[n+i]=nums[i];
        }
        return a;
    }
}
