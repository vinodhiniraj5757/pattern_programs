public class starpatt5 {
    public static void main(String[] args)
    {
    
        for(int i=1;i<=3;i++)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print("  ");

            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(i==2 && j==2 ||i==3 && j==2 ||j==4)
                System.out.print("   ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=i+i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=4-(i+i-1);j++)
            {
                if(i==1 && j==2)
                System.out.print("    ");
                else
                System.out.print("* ");
            }
            System.out.println();
            
        }
       
        // 2nd code

        System.out.println();
        System.out.println();
        for(int i=1;i<=3;i++){
            for(int k=1;k<=i+1;k++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=4-i;j++)
            {
                System.out.print("*     ");
            }
            System.out.println();
            

        }
        for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=3-i;k++)
            {
                System.out.print("     ");
            }
            for(int j=1;j<=i+1;j++)
            {
                System.out.print("*     ");
            }
            System.out.println();
            System.out.print("  ");
        }

        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            System.out.print("     ");
            for(int j=1;j<=5;j++)
            {
                if(i==1 && j%2!=0||i==5 && j%2 !=0||j==6-i|j==i||j==3 && i%2!=0)
                System.out.print("*  ");
                else
                System.out.print("   ");
            }
            System.out.println();
        }

    }
    
}
