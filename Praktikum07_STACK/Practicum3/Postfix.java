public class Postfix {

    private int n;
    private int top;
    private char[] stack;
    private String p = "";

    public Postfix(int total) {
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c) {
        top++;
        stack[top] = c;
    }

    public char pop() {
        char item = stack[top];
        top--;
        return item;
    }

    public boolean isOperand(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == ' ' || c == '.';
    }

    public boolean isOperator(char c) {
        return c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+';
    }

    public int precedence(char c) {
        switch (c) {
            case '^':
                return 3;
            case '%':
            case '/':
            case '*':
                return 2;
            case '-':
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String infixToPostfix(String Q) {
        String P = "";
        char c;
        for (int i = 0; i < n; i++) {
            c = Q.charAt(i);
            if (!isOperand(c)) {
                P = P + c;
            } else {
                if (c == '(') {
                    push(c);
                } else if (c == ')') {
                    while (stack[top] != '(') {
                        P = P + pop();
                    }
                    pop();
                } else if (isOperator(c)) {
                    while (top != -1 && precedence(stack[top]) >= precedence(c)) {
                        P = P + pop();
                    }
                    push(c);
                } else {
                    P = P + c;
                }
            }
        }
        while (top != -1) {
            P = P + pop();
        }
        return P;
    }
}
