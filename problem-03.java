//1249. Minimum Remove to Make Valid Parentheses

class Solution {
    public String minRemoveToMakeValid(String s) {
        //soln without stack
        //somewhat inspired from Algo Made Easy
        
        char ch[] = s.toCharArray(); 
        //since, we can't mark in string(immutable)
        //so, we converted string to charArray to make some changes in the array(Basically to mark)


        //first pass(left->right), identifying excess closing parenthesis and marking them.
        int count=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='(') count++;
            else if(ch[i]==')'){
                if(count>0) count--;
                else ch[i]='#';
            }
        }

        //2nd pass (right->left), identifying excess open parenthesis and marking them(same logic).
        count=0;
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==')') count++;
            else if(ch[i]=='('){
                if(count>0) count--;
                else ch[i]='#';
            }
        }

        //introduced the stringBuilder class(would have done using string also)
        StringBuilder res = new StringBuilder();

        for(int i=0;i<ch.length;i++){
            if(ch[i]!='#') res.append(ch[i]);
        }

        return res.toString();



    }
}
