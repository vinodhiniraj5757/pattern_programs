public class patt8 {
    public static void main(String[] args)
    {
        int a=1,b=0;
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=5;j++)
            {
                if(j==i)
                {
                    System.out.print(a++);
                }
                else
                {
                    System.out.print(b);
                }

            }
            System.out.println();

        }
       
    }
    
}
