public class patt29 {
    public static void main(String[] args)
    {
        int a=3;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
            }
            System.out.println();
            a=a+1;
        }
        int b=5;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=4-i;j++)
            {
                System.out.print(b+" ");
            }
            System.out.println();
            b=5-i;
        }
        System.out.println();


        //2nd pattern
        System.out.println("*");
        for(int i=1;i<=3;i++)
        {
            int l=1;
                System.out.print("* ");
            
            for(int j=1;j<=i+i-1;j++)
            {
                if(i>=j)
                System.out.print(l+++" ");
                else
                System.out.print((2*i-j)+" ");
                
            }
            System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<=2;i++)
        {
            int v=1;
            System.out.print("* ");
            for(int j=1;j<=4-(i+i-1);j++)
            {
                if(j<=3-i)
                System.out.print(v++ +" ");
                else
                System.out.print(j-2*i+" ");
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");

        //3rd pattern
        System.out.println();
        System.out.println();
        int o=1;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(o+++" ");

            }
            System.out.println();

        }

    }
    
}
