public class patt15 {
    public static void main(String[] args)
    {
        int a=65;
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)a+" ");
            }
            System.out.println();
            a=65+i;
        }
    }
    
}
