public class patt12 {
    public static void main(String[] args)
    {
        int a=5,b=5;
        for(int i=1;i<=5;i++)
        {
           
            for(int k=1;k<=5-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i>j)
                {
                    System.out.print(a++);
                }
                else{

                    System.out.print(b);
                }
                
            }
            System.out.println();
            a=a-i;
        }
    }
    
}
