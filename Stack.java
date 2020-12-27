import java.util.Scanner;
class Stack
{
    int S[];
    int top;

    Stack()
    {
        S = new int[5];
        for(int i=0;i<=4;i++)
            S[i]=0;
        top = -1;
    }

    void Push()
    {
        int element;
        if(top==4)
            System.out.println("Stack Overflow, cannot insert any more elements.");
        else
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Element to Insert into Stack.");
            element = sc.nextInt();
            top=top+1;
            S[top]=element;
        }
    } 

    void Pop()
    {
        if(top==-1)
            System.out.println("Stack Underflow, cannot delete any more elements.");
        else
        {
            System.out.println("The deleted element from the Stack is:"+S[top]);
            top = top-1;
        }
    }  

    void Display()
    {
        if(top==-1)
            System.out.println("Stack Underflow, cannot display any elements.");
        else
        {
            System.out.println("Contents of the Stack are:");
            //System.out.println();
            for(int i=top;i>=0;i--)
                System.out.println(S[i]);
        }
    }

    public static void main(String []args)
    {
        int i;
        Stack s = new Stack();
        s.Pop();
        for(i=1;i<5;i++)
            s.Push();
        s.Display();
        for(i=1;i<3;i++)
            s.Pop();
        s.Display();
        for(i=1;i<5;i++)
            s.Push();
        s.Display();
        for(i=1;i<3;i++)
            s.Pop();
        s.Display();
    }
}