class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int n = x;
        long long RevNUM = 0;

        while(n>0){
            int d = n%10;
            RevNUM = RevNUM * 10 + d;

            n = n/10;
        }
        if(RevNUM == x){
            return true;
        }else{
            return false;
        }
    }
};