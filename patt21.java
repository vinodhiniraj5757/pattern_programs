public class patt21 {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            int a=1;
            System.out.print(" ");
            for(int j=1;j<=i+i-1;j++)
            {
                if(i>j)
                 System.out.print(a++);
                 else
                  System.out.print(a--);

            }
            System.out.println();
        }
        for(int i=1;i<=3;i++)
        {
            int a=1;
            System.out.print(" ");
            for(int j=1;j<=6-(i+i-1);j++)
            {
                if(j<=4-i)
                 System.out.print(a++);
                 else
                 System.out.print(a--);
            }
            System.out.println();
        }
    }
    
}
