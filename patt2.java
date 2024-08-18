public class patt2 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            int a=1,b=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(a++);
            }
            for(int j=1;j<=5-i;j++)
            {
                System.out.print(b);
            }
            System.out.println();
        }
        
    }
}
