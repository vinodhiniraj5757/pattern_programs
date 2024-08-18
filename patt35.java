public class patt35 {
    public static void main(String[] args)
    {
       
        for(int i=1;i<=5;i++)
        {
            int a=6-i,b=2;
            System.out.print(" ");
            for(int j=1;j<=10-(i+(i-1));j++)
            {
                if(j<=6-i)
                System.out.print(a-- +" ");
                else
                System.out.print(b++ + " ");
            }
            System.out.println();
           
        }

        
        for(int i=1;i<=5;i++)
    {
        int c=1;int d=i-1;
        for(int k=1;k<=6-i;k++)
        {
            System.out.print("  ");
        }
        for(int j=1;j<=i+i-1;j++)
        {
            if(j<=i)
            System.out.print(c++ +" ");
            else
            System.out.print(d-- +" ");
        }
        System.out.println();
    }
    System.out.println();System.out.println();
    for(int i=1;i<=5;i++)
    {
        int f=1;
        for(int j=1;j<=i;j++)
        {
            System.out.print("  ");
        }
        for(int k=1;k<=10-(i+i-1);k++)
        {
            System.out.print(f++ +" ");
        }
        System.out.println();
    }
    System.out.println();
    System.out.println();
    for(int i=1;i<=5;i++)
    {
        int l=i,m=2*(i-1);
        for(int k=1;k<=6-i;k++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=i+i-1;j++)
        {
            if(j<=i)
            System.out.print(l++);
            else
            System.out.print(m--);
        }
        System.out.println();
    }
    }


    
}
