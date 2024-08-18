
public class patt1 {
    public static void main(String[] args)
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j==i)
                {
                    System.out.print(i+" ");
                }
                else
                {

                    System.out.print(a+" ");
                }
                
            }
            System.out.println();
        }
          
    }
    
}
// Scanner s=new Scanner(System.in);
// int n=s.nextInt();
// int c=63;
// for(int i=1;i<=n;i++)
// {
//     int a=65;
//     int b=c+i;
  
//     for(int j=1;j<=i+i-1;j++)
//     {

//         if(i>=j)
//         {
//             if(j<i+i-1)
//             System.out.print((char)a++ +" ");
//             else
//             System.out.print((char)a++);
//         }
//         else
//         {
//             if(j<i+i-1)
//             System.out.print((char)b-- +" ");
//             else
//             System.out.print((char)b--);
//         }
       
//     }
//      System.out.println();
    
//        for(int k=1;k<=4-i;k++)
//     {
//         System.out.print("  ");
//     }
   
// }
//  s.close();
// }