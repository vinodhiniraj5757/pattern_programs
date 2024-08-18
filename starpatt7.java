public class starpatt7 {
    public static void main(String[] args)
    {
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=8-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=7-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++)
            {
                if(i==2 && j==3 ||i==3 && j==2)
                System.out.print("o ");
                else if(i==3 && j==4 ||i==5 && j==2)
                System.out.print("O ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=3+i;j++)
            {
                if(i==2 && j==4)
                System.out.print(". ");
                else if(i==5 && j==2 ||i==6 && j==5)
                System.out.print("o ");
                else if(i==5 && j==7)
                System.out.print("+ ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=6;i++)
        {
            for(int k=1;k<=4;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=6;j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }


        System.out.println("2nd code");
        System.out.println();
        System.out.println();
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i+i-1;j++)
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
            for(int j=1;j<=8-(i+i-1);j++)
                {
                    if(i%2!=0)
                    System.out.print("-");
                    else
                    System.out.print("*");
                }
                System.out.println();
            
        }

    } 
}
