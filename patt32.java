public class patt32 {
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=i+i-1;j++)
            {
                if(j==1||j==i||j==i+i-1||i==5)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<=4;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print(" ");
            }
            
            for(int j=1;j<=8-(i+i-1);j++)
            {
                if(j==1||j==8-(i+i-1)||j==5-i||i==4)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();

        }
        //2nd program
        System.out.println(" ");
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=6-i;k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<=i+i-1;j++)
            {
                if(j==i+i-1||i==5)
                System.out.print("*");
                else
                System.out.print(" ");
            
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=i+1;k++)
            {
                System.out.print(" ");

            }
            for(int j=1;j<9-(i+i-1);j++)
            {
                if(j==8-(i+i-1))
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();

        }


         //3rd program
         System.out.println(" ");
         for(int i=1;i<=5;i++)
         {
             for(int k=1;k<=6-i;k++)
             {
                 System.out.print(" ");
 
             }
             for(int j=1;j<=i+i-1;j++)
             {
                 if(j==1||i==5)
                 System.out.print("*");
                 else
                 System.out.print(" ");
             
             }
             System.out.println();
         }
         for(int i=1;i<=5;i++)
         {
             for(int k=1;k<=i+1;k++)
             {
                 System.out.print(" ");
 
             }
             for(int j=1;j<9-(i+i-1);j++)
             {
                 if(j==1)
                 System.out.print("*");
                 else
                 System.out.print(" ");
             }
             System.out.println();
 
         }
    }
    
}
