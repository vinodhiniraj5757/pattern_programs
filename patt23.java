public class patt23 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=3;i++)
        {
             for(int j=1;j<=i;j++)
            {
                 a=i*j;
                System.out.print(a+" ");
                
            }
            System.out.println();
           
        }
        for(int i=1;i<=2;i++)
        {
            for(int j=1;j<=3-i;j++)
            {
                if(i>=j)
                 System.out.print(3-i+" ");
                 else
                  System.out.print("4"+" ");

            }
            System.out.println();
        }
    }
    
}
