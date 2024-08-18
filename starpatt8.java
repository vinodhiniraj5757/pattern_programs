public class starpatt8 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0)
                System.out.print("*");
                else
                System.out.print("-");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=5-i;j++)
            {
                if(i%2!=0)
                System.out.print("_");
                else
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2nd code");
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+i-1;j++
            )
            {
                if(j==1||j==i+i-1)
                System.out.print("*");
                else
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("3rd code");
        System.out.println();
        for(int i=1;i<=3;i++)
        {
            int a=65;
            for(int k=1;k<=4-i;k++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            { System.out.print((char)a+++"      ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("4th code");
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            int b=65;
            System.out.print("  ");
            for(int j=1;j<=6-i;j++)
            {
                System.out.print((char) b++ +"  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("5th code");
        System.out.println();
        for(int i=1;i<=5;i++)
        {
        
            System.out.print(" ");
            for(int j=1;j<=5;j++)
            {
                if(i%2!=0)
                {
                    if(j%2!=0)
                    System.out.print("1"+" ");
                    else
                    System.out.print("0"+" ");
                }
                else
                {
                    if(j%2==0)
                    System.out.print("1"+" ");
                    else
                    System.out.print("0"+" ");
                }
                
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("6th code");
        System.out.println();
       
        for(int i=1;i<=3;i++)
        {
            int c=1;
            for(int k=1;k<=4-i;k++)
            {
                System.out.print("    ");
            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(i>=j)
                {
                    if(i==2 && j==2 || i==3 && j==2  )
                    {
                        if(j==3 &&i==3)
                        System.out.print("2   ");
                        else
                        System.out.print("    ");
                        
                    }
                    
                    else
                    System.out.print(c++ +"   ");
                }  
                else
                {
                    if(i==3 &&j==4)
                    System.out.print("    ");
                    else
                    System.out.print(2*i -j+"  "); 

                }
                
                               
            }
            System.out.println();
        }
    }
    
}
