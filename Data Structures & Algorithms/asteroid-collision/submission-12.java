class Solution {
    public int[] asteroidCollision(int[] asteroicds) {
        Stack<Integer> stack = new Stack<>();

        for(int current: asteroicds){
            boolean alive = true;

            while(alive && current < 0 && !stack.isEmpty() && stack.peek() > 0){
                int currentSize = Math.abs(current);
                int top = stack.peek();
                if(top < currentSize){
                    stack.pop();
                }else if (top == currentSize){
                    stack.pop();
                    alive = false;
                }else {
                    alive = false;
                }
                
            }
            if(alive){
            stack.push(current);
            }
        }
        int[] result = new int[stack.size()];
        for(int i = 0 ; i<stack.size(); i++){
            result[i] = stack.get(i);
        }
      return result;

    }
}   