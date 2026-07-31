class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbers = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String current = tokens[i];

            boolean isOperator =
                    current.equals("+")
                    || current.equals("-")
                    || current.equals("*")
                    || current.equals("/");

            if (isOperator) {
                int rightNumber = numbers.pop();
                int leftNumber = numbers.pop();

                int result;

                if (current.equals("+")) {
                    result = leftNumber + rightNumber;

                } else if (current.equals("-")) {
                    result = leftNumber - rightNumber;

                } else if (current.equals("*")) {
                    result = leftNumber * rightNumber;

                } else {
                    result = leftNumber / rightNumber;
                }

                numbers.push(result);

            } else {
                int number = Integer.parseInt(current);
                numbers.push(number);
            }
        }

        return numbers.peek();
    }
}