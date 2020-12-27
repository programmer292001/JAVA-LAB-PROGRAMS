import java.util.Scanner;
class Account
{
    int Accno;
    String name;
    int Phone_No;
    float balance_amt;

    Account()
    {
        Accno=0;
        name="";
        Phone_No=0;
        balance_amt=0;
    }

    void getinput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account No:");
        Accno = sc.nextInt();
        System.out.println("Enter Associated Phone_No of the Account:");
        Phone_No = sc.nextInt();
        System.out.println("Enter Balance Amount of the Account:");
        balance_amt = sc.nextFloat();
        System.out.println("Enter name of Account holder:");
        name = sc.next();
    }

    void Deposit()
    {
        Scanner sc = new Scanner(System.in);
        float Dep_Amt=0;
        System.out.println("Enter Amount to be deposited:");
        Dep_Amt = sc.nextFloat();
        balance_amt = balance_amt+Dep_Amt;
        System.out.println("Current Account Balance:"+balance_amt);
    }

    void Withdraw()
    {
        Scanner sc = new Scanner(System.in);
        float Withdraw_Amt=0;
        System.out.println("Enter Amount to be withdrawn:");
        Withdraw_Amt = sc.nextFloat();
        if(Withdraw_Amt<balance_amt)
            balance_amt = balance_amt-Withdraw_Amt;
        else
            System.out.println("Withdraw Amount Exceeding Account Balance");
        System.out.println("Current Account Balance:"+balance_amt);
    }

    void Display()
    {
        System.out.println();
        System.out.println("Account Details:");
        System.out.println("Account No:"+Accno);
        System.out.println("Name of Accountholder:"+name);
        System.out.println("Phone No of Accountholder:"+Phone_No);
        System.out.println("Current Account Balance:"+balance_amt);
    }

    public static void main(String []args)
    {
        Account a = new Account();
        a.getinput();
        a.Deposit();
        a.Withdraw();
        a.Display();
    }
}