public class patt33 {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //hollow one
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4||j==1||j==4)
                System.out.print("*");
                else
                System.out.print(" ");
                
            }
            System.out.println();
        }
    }
    
}
