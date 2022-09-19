class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        if(s.length()==0)return 0;
        long n=0;
        boolean st=false;
        boolean sign=false;
        int ne=1;
        for(int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
            if(ch<='9' && ch>='0') 
            {
                if(!st)st=true;
            n=n*10+(ch-48);
            if(n*ne>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(n*ne<Integer.MIN_VALUE) return Integer.MIN_VALUE;
                
        }
            else if(!st && ch=='-' && !sign)
            {
                ne=-1;
                sign=true;
            }
            else if(!st && ch=='+' && !sign)
            {
                ne=1;
                sign=true;
            }
            else 
            {
                break;
            }
        }
        return (int)n*ne;
    }
}