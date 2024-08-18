public class patt26 {
    public static void main(String[] args)
    {
        // for(int i=1;i<=5;i++)
        // {
        //     int a=1,b=i-1;
        //     for(int k=1;k<=6-i;k++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i+i-1;j++)
        //     {
        //         if(i>=j)
        //           System.out.print(a++ +" ");
        //         else
        //           System.out.print(b--+" ");

        //     }
        //     System.out.println();
        // }
        
        for(int i=1;i<=5;i++)
        {
            int a=i,b=(2*i)-2;
            for(int k=1;k<=6-i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
               
                if(i>=j)
                 System.out.print(a+++" ");
                 else
                  System.out.print(b--+" ");
            }
            System.out.println();
            a=i+1;
        }
    }
    
}
