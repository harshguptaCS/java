class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        char c;
        for(int i=0;i<n/2;i++){
            c=s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=c;
        }
    }
}
