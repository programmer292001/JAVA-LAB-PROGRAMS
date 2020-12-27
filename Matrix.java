import java.util.Scanner;
class Matrix
{
    int M1[][];
    int M2[][];
    int M3[][];

    Matrix()
    {
        M1=new int[3][3];
        M2=new int[3][3];
        M3=new int[3][3];
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Matrix m = new Matrix();
        int i,j;
        System.out.println("Enter the elements of the first Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter the element of ("+(i+1)+","+(j+1)+") position of 1st Matrix.");
                m.M1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second Matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter the element of ("+(i+1)+","+(j+1)+") position of 2nd Matrix.");
                m.M2[i][j] = sc.nextInt();
            }
        }

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                m.M3[i][j]=m.M1[i][0]*m.M2[0][j]+m.M1[i][1]*m.M2[1][j]+m.M1[i][2]*m.M2[2][j];
            }
        }

        System.out.println("The product of the 2 matrices is:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(m.M3[i][j]+"  ");
            }
            System.out.println();
        }
    }
}