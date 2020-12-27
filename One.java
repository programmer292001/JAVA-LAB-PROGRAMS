import java.util.Scanner;
class One
{
    static int Fib(int n)
    {
        if(n==1||n==2)
            return 1;
        return(Fib(n-1)+Fib(n-2));
    }

    public static void main(String Args[])
    {
        Scanner sc = new Scanner(System.in);
        //Fibonacci Series without Recursion.
        int a=1,b=1,i=0,k=0,t=0;
        System.out.println("Fibonacci Series without Recursion:");
        for(i=1;i<=4;i++)
        {
            System.out.print(a+" ");
            System.out.print(b+" ");
            a=a+b;
            b=a+b;
        }
        //End of Fibonacci Series without Recursion.
        System.out.println();
        //Fibonacci Series with Recursion
        System.out.println("Fibonacci Series with Recursion:");
        for(i=1;i<=8;i++)
        {
            System.out.print(Fib(i)+" ");
        }
        //End of Fibonacci Series with Recursion.
        System.out.println();

        //To check for Prime Numbers.
        int n1;
        System.out.println("Enter a number:");
        n1=sc.nextInt();
        int c=0;
        for(i=1;i<=n1;i++)
        {
            if(n1%i==0)
                c=c+1;
        }
        if(c==2)
            System.out.println("The given no is a Prime Number.");
        else
            System.out.println("The given no is not a Prime Number.");
        //End of Check for Prime Numbers.
        
        //Binary Sort On Array Elements 
        int ar[];
        System.out.println("Enter the no of elements of the Array:");
        int l =sc.nextInt();
        ar = new int[l];
        for(i=0;i<l;i++)
        {
            System.out.println("Enter "+(i+1)+"th element of the Array:");
            ar[i]=sc.nextInt();
        } 
        System.out.println("Contents of Array Before Sorting:");
        for(int x:ar)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Contents of Array After Binary Sort in Ascending Order:");
        for(i=0;i<l;i++)
        {
            for(k=i+1;k<l;k++)
            {
                if(ar[k]<ar[i])
                {
                    t=ar[k];
                    ar[k]=ar[i];
                    ar[i]=t;
                }
            }
        }

        for(int x:ar)
        {
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Contents of Array After Binary Sort in Descending Order:");
        for(i=0;i<l;i++)
        {
            for(k=i+1;k<l;k++)
            {
                if(ar[k]>ar[i])
                {
                    t=ar[k];
                    ar[k]=ar[i];
                    ar[i]=t;
                }
            }
        }
        
        for(int x:ar)
        {
            System.out.print(x+" ");
        }

    }
}