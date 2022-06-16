import java.util.Scanner;
class TwoDArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][] = new int[2][3]; // r=2,c=3
        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("Enter Array Elements : ");
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
