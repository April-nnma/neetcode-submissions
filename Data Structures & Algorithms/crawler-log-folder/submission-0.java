class Solution {
    public int minOperations(String[] logs) {
        Stack<String> folders = new Stack<>();

        for(int i = 0; i < logs.length; i++){
            String current  = logs[i];

            if(current.equals("../")){
                if(!folders.isEmpty()){
                    folders.pop();
                }
            }else if(current.equals("./")){
                //nothing
            }else{
                folders.push(current);
            }   
        }
    return folders.size();
    }
}