class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for(String current : parts){
            if(current.equals("") || current.equals(".")){
                continue;
            }else if(current.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(current);
            }
        } 
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder result = new StringBuilder();
        for(String folder : stack){
            result.append("/");
            result.append(folder);
           
        }
        return result.toString();      
    }
}