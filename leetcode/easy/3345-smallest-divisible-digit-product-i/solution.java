class Solution {
    private int mul (int n){
        int mul = 1;
        while(n!=0){
            mul*=n%10;
            if(mul==0)return mul;
            n/=10;
        }
        return mul;
    }
    public int smallestNumber(int n, int t) {
        while(true){
            if(mul(n)%t==0)return n;
            n++;
        }
    }
}