class Solution {
    public boolean isValid(String s) {
        char[] c=s.toCharArray();
        Stack<Character> stack1=new Stack<>();
        for(char s1:c){
            if(s1=='(' || s1=='{' || s1=='['){
                stack1.push(s1);
            }
            else if(stack1.isEmpty()){
                return false;
            }
            else if(s1==')' && stack1.peek()!='('){
                return false;
            }
            else if(s1=='}' && stack1.peek()!='{'){
                return false;
            }
            else if(s1==']' && stack1.peek()!='['){
                return false;
            }
            else{
                stack1.pop();
            }
        }
        return stack1.isEmpty();
        
    }
}