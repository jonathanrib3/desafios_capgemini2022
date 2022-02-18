package challenge03;

public class FixedStack {
    private String[] stack;
    private int top;

    public FixedStack(int size) {
        this.stack = new String[size];
        this.top = 0;
    }

    public void push(String element) {
        if(!isFull()){
            stack[top] = element;
            top++;
        }
    }
    /*
    public void pop() {

        top--;
        stack[top] = "";
    }
    */
    public boolean isFull() {
        return top == stack.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public String[] getStack() {
        return stack;
    }
}
