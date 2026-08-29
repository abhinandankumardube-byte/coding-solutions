class Solution {
    private int sum(int x){
        int mul = 1;
        int sum = 0;
        while(x!=0){
            sum+=x%10;
            mul*=x%10;
            x/=10;
        }
        return mul+sum;
    }
    public boolean checkDivisibility(int n) {
        if(n%sum(n)==0)return true;
        return false;
    }
}