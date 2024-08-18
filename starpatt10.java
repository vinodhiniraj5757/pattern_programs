public class starpatt10 {
    public static void main(String[] args)
    {
        for(int i=1;i<=8;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=8;j++)
            {
                if(j==i)
                System.out.print(" + ");
                if(j==9-i)
                System.out.print(" + ");
                else
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
