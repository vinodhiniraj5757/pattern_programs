public class patt20 {
    public static void main(String[] args)
    {
        int a=1,b=5;
        for(int i=1;i<=4;i++)
        {
            a=i+i-1;
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print(a+" ");
            }
            for(int k=1;k<=16-(4*i);k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                System.err.print(a+" ");
            }
            System.out.println();
            
        }
        for(int i=1;i<=3;i++)
        {
            b=6-(i+i-1);
            for(int j=1;j<=6-(i+i-1);j++)
            {
                System.out.print(b+" ");
            }
            for(int k=1;k<=4*i;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=6-(i+i-1);j++)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    
}
