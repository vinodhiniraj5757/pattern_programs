public class strapathall3 {
    public static void main(String[] args)
    {
        for(int i=1;i<=9;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=9;j++)
            {
                if(i==1||i==9||j==i||j==10-i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=9;j++)
            {
                if(i==1||i==9||j==i||j==10-i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=9;j++)
            {
                if(i==1||i==9||j==i||j==10-i)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
           
            System.out.println();
        }
    }
    
}
