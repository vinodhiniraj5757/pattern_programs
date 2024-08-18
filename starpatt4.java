public class starpatt4 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=4;i++)
        {
            System.out.print(" ");
            for(int j=1;j<=4;j++)
            {
                if(a<10)
                {
                    if(j==4)
                    System.out.print(" "+a++);
                    else
                    System.out.print(" "+a++ +"*");
                }
                else
                if(j==4)
                    System.out.print(" "+a++);
                    else
                    System.out.print(a++ +"*");
        
            }
            System.out.println(" ");
        }


        //2nd program
        System.out.println();
        int s=1,b=9;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1||i==4)
                {
                    if(j==4)
                    System.out.print(s++);
                    else
                    System.out.print(s++ +"*");
                }
               
                else
                {
                    if(j==4)
                    System.out.print(b++);
                    else
                    System.out.print(b++ +"*");
                }
                
            }
            System.out.println();
        }
    }
    
}
