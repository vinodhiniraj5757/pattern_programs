public class patt30 {
    public static void main(String[] args)
    {
        for(int i=0;i<7;i++)
        {
                int a=1;
                for(int k=1;k<=8-i;k++)
                {
                    System.err.print(" ");
                }
                for(int j=0;j<=i;j++)
                {
                    System.out.print(a+" ");
                    a = a* (i-j) / (j + 1);
                }
                System.out.println();
        }
     }
}