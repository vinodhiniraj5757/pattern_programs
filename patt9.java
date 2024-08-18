public class patt9 {
    public static void main(String[] args)
    {
        
        for(int i=1;i<=5;i++)
        {
            int a=1;
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(a++);
            }
            System.out.println();
        }
    }
    
}
