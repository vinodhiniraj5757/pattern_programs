public class starpatt3 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=7-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(i==1)
                System.out.print(" ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i+2;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=8-(i+i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i+1;j++)
            {
            
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd program
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i+i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            System.out.println();
            System.out.print("     ");
        }
        System.out.print(" ");
        for(int i=1;i<=3;i++)
        {
        for(int k=1;k<=6-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=4-i;j++)
        {
            System.out.print("* ");
        }
        System.out.println();
        System.out.print("    ");

    }
}
    
}
