public class patt17 {
    public static void main(String[] args)
    {
        for(int i=1;i<=11;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=11;j++)
            {
                if(i==1||j==12-i)
                System.out.print("7");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
