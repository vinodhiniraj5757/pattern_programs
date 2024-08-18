public class patt19 {
    public static void main(String[] args)
    {
        int a=2,b=2,c=2;
        for(int i=1;i<=3;i++)
        {
            for(int k=1;k<=4-i;k++)
            {
                System.out.print("  ");
            }
            a=(2*i)-b;
            for(int j=1;j<=(i+i-1);j++)
            {
                if(j==i+i-1)
                {
                    System.out.print(" "+0);
                }
                else{
                    if(i==3)
                    {

                        System.out.print("-"+a--);
                    }
                    else
                    System.out.print("-"+a++);
                }
            }
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=4-(i+i-1);j++)
            {
                if(j==4-(i+i-1))
                System.out.print(" "+0);
                else
                System.out.print("-"+c++);
            }
            System.out.println();
        }
    }
    
}
