class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(c!=' '){
                for(int j = i;j>=0;j--){
                    char ch = s.charAt(j);
                    if(ch==' ')return count;
                    else count++;
                }
                return count;
            }
        }
        return count;
    }
}