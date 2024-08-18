public class patt28 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=4;i++)
        {
            System.out.print(a);
            for(int j=1;j<i;j++)
            {
                System.out.print("*"+i);
                
            }
            System.out.println();
            a=a+1;
        }
        int b=4;
        for(int i=1;i<=4;i++)
        {
            System.out.print(b);
            for(int j=1;j<5-i;j++)
            {
                System.out.print("*"+(5-i));
            }
            System.out.println();
            b=b-1;
        }

        System.out.println();
        int l=1;
       
        for(int i=1;i<=4;i++)
        { 
            int c=l;
            
            System.out.print(l);
            for(int j=1;j<i;j++)
            {
               
                System.out.print("*"+ ++c);
            }
            System.out.println();
            l=c+1; 
        }
        int m=3;
        for(int i=1;i<=3;i++)
        {
            System.out.print(m);
            for(int j=1;j<4-i;j++)
            {
                int n=m;
                System.out.print("*"+ (n-j));
            }
            System.out.println();
            m=m-1;
        }
    }
    
}
