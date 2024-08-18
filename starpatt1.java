public class starpatt1 {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1 && j==1)
                System.out.print("*"+"  ");
                else
                {
                    if(i==2 && j>=3||i==4||i==3 &&j>=2)
                    System.out.print("*"+" ");
                    else
                    System.out.print("  ");

                }
            }
            System.out.println();
        }




        //2nd program
        System.out.println();
        System.out.println();
        System.out.println();
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print("*"+" ");
            }

            for(int k=1;k<=7-(2*i-1);k++)
            {
                System.out.print("    ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        
    }
    
}
