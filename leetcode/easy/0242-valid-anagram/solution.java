class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char a1[] = s.toCharArray();
        char a2[] = t.toCharArray();
        for(int i=0;i<a1.length;i++){
            boolean fl=false;
            for(int j=0;j<a2.length;j++){
                if(a1[i] == a2[j]){
                    a2[j]=' ';
                    fl=true;
                    break;
                }
            }
            if(fl==false)return false;
        }
        return true;
    }
}