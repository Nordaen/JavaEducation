package Chapter6;

public class Stack_task2 {

    private int mSize;
    private int[]stackArray;
    private int top;

    public Stack_task2(int m){
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }
    public void push(int element){
        stackArray[++top] = element;
    }
    public int pop(){
        return stackArray[top--];
    }
    public int read(){
        return stackArray[top];
    }

}
