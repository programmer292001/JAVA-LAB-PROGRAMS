import java.util.Scanner;
import java.util.Arrays;
class string
{
    public static void main(String []args)
    {
        int m,n;
        Scanner sc = new Scanner(System.in);
        String s="";
        String s1="";
        String s2="";
        System.out.println("Enter text or a string:");
        s=sc.nextLine();
        System.out.println("Enter no of characters to be extracted from the given string:");
        m=sc.nextInt();
        System.out.println("Enter the nth starting position of the string to extract the substring:");
        n=sc.nextInt();
        System.out.println("The substring from nth position containing m characters is:"+s.substring(n,n+m));

        System.out.println("Enter a word whose no of occurences in the string is to be counted:");
        s1=sc.next();
        int ns=s.length();
        int n1=s1.length();
        int count=0;
        for(int i=0;i<ns;i++)
        {
            if(i<=ns-n1)
            {
                s2=s.substring(i,i+n1);
                if(s1.equals(s2))
                    count=count+1;
            }
        }
        System.out.println("The no of occurences of the given string in the text is:"+count);

        String s3="Hello Everyone";
        System.out.println("Original String:"+s3);
        System.out.println("Replaced String:"+s3.replace("Hello","Hi"));

        char tempArray[] = (s3.toLowerCase()).toCharArray(); 
        Arrays.sort(tempArray); 
        String as = String.valueOf(tempArray);
        System.out.println("Alphabetically Sorted String:"+as);

        System.out.println("Comaparing 'Hello Everyone' with 'hello Everyone':"+s3.equalsIgnoreCase(s3.replace("Hello","hello")));

        String s4=", My name is King"; 
        System.out.println("Concatenating 'Hello Everyone' with ', My name is King':"+s3.concat(s4));
    }
}