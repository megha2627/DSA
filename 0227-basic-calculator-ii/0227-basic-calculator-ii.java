class Solution {
    public int calculate(String s) {
        int n=s.length();
        s=s.trim();
        int last=0;
        char sign='+';
        int current=0;
        int result=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                current = current * 10 + (s.charAt(i) - '0');

            }
            if((!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ') || i==s.length()-1){
                if(sign=='+'){
                    result=result+last;
                    last=current;
                    

                }
                else if(sign=='-'){
                    result=result+last;
                    last=-current;
                    
                    
                }
                else if(sign=='/'){
                    last=last/current;

                    
                }
                else if(sign=='*'){
                    last=last*current;
                    
                }
                current=0;
                sign=s.charAt(i);
            }

        }
        result=result+last;
        return result;
        
    }
}