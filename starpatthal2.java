public class starpatthal2 {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
                
            }
            for(int k=1;k<=6-(i+i-1);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                if(j==1 &&i==4)
                System.out.print("");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++)
        {
            System.out.print("  ");
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("* ");
                
            }
            for(int k=1;k<=i+i-1;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i;k++)
            {
            
                System.out.print("  ");
            }
            for(int j=1;j<=8-(i+i-1);j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
}
}

    
