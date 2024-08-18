public class starpatt6 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
                for(int j=1;j<=5;j++)
                {
                    if(j==6-i)
                    System.out.print("* ");
                    else
                    System.out.print("    ");
                }
                System.out.println();   
        }

        System.out.println();
        System.out.println();
        System.out.println("2nd code");
        for(int i=1;i<=5;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=5;j++)
            {
                if(j==i||j==6-i)
                System.out.print("*  ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("3rd code");
        for(int i=1;i<=3;i++)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(j==1||j==i+i-1)
                System.out.print("* ");
                else
                System.out.print("   ");

            }
            System.out.println();
        }

    }
    
}
