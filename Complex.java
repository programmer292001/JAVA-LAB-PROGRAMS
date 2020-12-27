import java.util.Scanner;
class Complex
{
    float r;
    float i;

    Complex(float real, float imaginary)
    {
        r=real;
        i=imaginary;
    }

    void Add()
    {
        float r1,i1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of Second Complex No:");
        r1 = sc.nextFloat();
        System.out.println("Enter imaginary part of Second Complex No:");
        i1 = sc.nextFloat();
        System.out.println("Result of Addition of "+r+"+"+i+"i"+" + "+r1+"+"+i1+"i"+" = "+(r+r1)+"+"+(i+i1)+"i");
    }

    void Subtract()
    {
        float r1,i1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of Second Complex No:");
        r1 = sc.nextFloat();
        System.out.println("Enter imaginary part of Second Complex No:");
        i1 = sc.nextFloat();
        System.out.println("Result of Subtraction of "+r+"+"+i+"i"+" - "+r1+"+"+i1+"i"+" = "+(r-r1)+"+"+(i-i1)+"i");
    }

    void Multiply()
    {
        float r1,i1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of Second Complex No:");
        r1 = sc.nextFloat();
        System.out.println("Enter imaginary part of Second Complex No:");
        i1 = sc.nextFloat();
        System.out.println("Result of Multiplication:"+(r*r1-i*i1)+"+"+(r*i1+r1*i)+"i");
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part of First Complex Number:");
        float real = sc.nextFloat();
        System.out.println("Enter imaginary part of First Complex Number:");
        float imaginary = sc.nextFloat();
        Complex c = new Complex(real,imaginary);
        c.Add();
        c.Subtract();
        c.Multiply();
    }
}