public class patt27 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=6;i++)
        {
            for(int k=1;k<=9-i;k++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+"*");
                
            }
            for(int k=1;k<=8-i;k++)
                {
                    System.out.print("*");
                }

            System.out.println();
            a=a+1;
        }

    }
    
}
