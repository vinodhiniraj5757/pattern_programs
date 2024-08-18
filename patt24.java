public class patt24 {
    public static void main(String[] args)
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1)
                System.out.print("1"+" ");
                else
                System.out.print("0"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=7-i;j++)
            {
                if(j==1)
                System.out.print("1"+" ");
                else
                System.out.print("0"+" ");
            }
            System.out.println();
        }

    }
    
}
