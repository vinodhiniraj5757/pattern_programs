public class patt14 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            int a=69;
            for(int j=1;j<=6-i;j++)
            {
                System.out.print((char)a--);
            }
            System.out.println();
        }
    }
    
}
