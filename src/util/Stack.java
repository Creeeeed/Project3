package util;

public class Stack
{
    public int stack[] = new int[5];
    int top = 0;


    public void push(int data){
        if (top==5){
            System.out.println("Stack is full");
        }
        else
        {
        stack[top] = data;
        top++;
        }
        //increments


    }
    public int pop()
    {
        int data = 0;

        if (requiresGrowth())
        {
            System.out.println("Stack is empty");
        }
        else
        {
            top--;
            data = stack[top];
            stack[top] = 0;
        }
        return data;
    }
    public int size()
    {
        return top;
    }

    public boolean requiresGrowth()
    {
        return top<= 0;
    }

    public void show(){
        for(int n : stack)
        {
            System.out.println((n + " "));
        }

    }
}

//References
//https://www.youtube.com/watch?v=fptlqsesjxY
//https://www.youtube.com/watch?v=fptlqsesjxY
