public class starpatt2 {
    public static void main(String[] args)
    {
        for(int i=1;i<=9;i++)
        {
           System.out.print(" ");
            for(int j=1;j<=9;j++)
            {
                if(j==1 && i%2!=0 ||i==5 && j%2!=0||j==9 && i%2!=0||j==i||j==10-i||i==4 && j%2==0||i==6 && j%2==0
               )
                System.out.print("*"+" ");
                else
                System.out.print("  ");

            }
            System.out.println();
        }

        //2nd program
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=6-i;j++)
            {
                System.out.print("*"+"   ");
            }
            System.out.println();
        
        }
        for(int j=1;j<=4;j++)
        {
            for(int k=1;k<=5-j;k++)
            {
                System.out.print("  ");
            }
            for(int i=1;i<=j+1;i++)
            {
                System.out.print("*   ");
            }
            System.out.println();
        }
       

    }
    
}
