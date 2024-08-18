public class patt11 {
    public static void main(String[] args)
    {
        int a=1,b=0;
        for(int i=1;i<=5;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=7;j++)
            {
                if(i%2!=0)
                {
                    if(j==1||j==3||j==5||j==7)
                    {
                        System.out.print(a);
                    }
                    else{
                        System.out.print(b);
                    }
                }
                else{

                    if(j==1||j==3||j==5||j==7)
                    {
                        System.out.print(b);
                    }
                    else{
                        System.out.print(a);
                    }
                }
            }
            System.out.println();
        }
    }
    
}
