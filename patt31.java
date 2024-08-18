public class patt31 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=6-i;j++)
            {
            
                System.out.print("*");
            }
            for(int k=1;k<=i+i-1;k++)
            {

                System.out.print(" ");
            }
            
            for(int j=1;j<=6-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=10-(i+i-1);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        //2nd pattern
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        for(int i=1;i<=7;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=7;j++)
            {
                if(i==1||j==1||j==7||i==7||j==i||j==8-i)
                System.out.print("*");
                else
                System.out.print(" ");

            }
            System.out.println(" ");
        }
    }
    
}
