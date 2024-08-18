public class patt25 {
    public static void main(String[] args)
    {
        int a=0,b=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==4)
                {
                    System.out.print(" ");
                }
                else{
                System.out.print(a + " ");
                int next = a + b;
                a = b;
                b = next;
                }
               
            }
            System.out.println();
        }
        
    }
}
