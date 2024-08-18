public class patt18 {
    public static void main(String[] args)
    {
        int a=2,b=2,c=4;
        for(int i=1;i<=3;i++)
        {

            a=b*i;
            for(int k=1;k<=3-i;k++)
            {
                System.err.print("  ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(a+++" ");
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("  ");
            }
            c=(6-(2*i));
            for(int j=1;j<=(4-(i+i-1));j++)
            {
                System.out.print(c++ +" ");
            }
            System.out.println();
           
        }

    }
    
}
