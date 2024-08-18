public class patt16 {
    public static void main(String[] args)
    {
        int a=1,b=0;
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==3||j==5||j==7)
                {
                    System.out.print(a+" ");
                }
                else{
                    System.out.print(b+" ");
                }
            }
            for (int j = 1; j < (7 - i) *2; j++) {
                System.out.print("  ");
            }
            for (int k=1; k<=i; k++) {
                if(i==7 && k==1)  // Skipping the extra 1
                {
                    continue;
                }
                if ((k%2)!=0) {  // Applying the condition
                    System.out.print(" 1");
                } else {
                    System.out.print(" 0");
                }
        }
            
            System.out.println();
        }
    
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=7-i;j++)
            {
                if(j==1||j==3||j==5)
                System.out.print(a+" ");
                else
                System.out.print(b+" ");
            }
            for(int k=1;k<=4*i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=7-i;j++)
            {
                if(j%2!=0)
                 System.out.print("1"+" ");
                else
                  System.out.print("0"+" ");
            }
            System.out.println();
        }
    
    
    }
}
