class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack();
        char[] charArr = s.toCharArray();
        Character top;
        for(char bracket : charArr){
            if(bracket == '[' || bracket == '(' || bracket == '{'){
                openBrackets.add(bracket);
            } else {
                if(openBrackets.isEmpty()){
                    return false;
                }
                top = openBrackets.pop();
                if(bracket == ']'){
                    if(top != '['){
                        return false;
                    }
                } else if(bracket == '}'){
                     if(top != '{'){
                        return false;
                    }
                } else if(bracket == ')'){
                     if(top != '('){
                        return false;
                    }
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
