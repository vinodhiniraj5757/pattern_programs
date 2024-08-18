public class patt34 {
        public static void main(String[] args)
        {
            int c=65;
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=8-i;j++)
                {
                    System.out.print("*");
                }
                // for(int k=1;k<=6-i;k++)
                // {
                //     System.out.print("* ");
                   
                // }
               for(int j=1;j<=2*i-1;j++)
               {     
                if(i<=j)
                {
                   
                    System.out.print((char)(c+(1*(j-i))));
    
                }
                else
                {
                    System.out.print((char)(c+(i-j)));
                    
                }       
               }
               for(int k=1;k<=i;k++)
               {
                System.out.print("");
               }
                for(int j=1;j<=7-i;j++)
                {
                    System.out.print("*");
                }
               System.out.println();   
            }
            int d=68;
            for(int i=1;i<=4;i++)
            {

                for(int k=1;k<=3+i;k++)
                {
                    System.out.print("*");
                }
                for(int j=1;j<=8-(i+(i-1));j++)
                {
                    if (j<=5-i) {
                      
                        
                    System.out.print((char) (d--));
                            
                           
                    } else {
                        System.out.print((char)(d+(j-4)+i) );
                        
                    }
                }
                for(int k=1;k<=2+i;k++)
                {
                    System.out.print("*");
                } 
                System.out.println();
                d=d+(4-i);     
            }

            //2nd code
            
            System.out.println();
            System.out.println();
            System.out.println();
            int p=65;
            for(int i=1;i<=5;i++)
            {
                for(int j=1;j<=8-i;j++)
                {
                    System.out.print("*");
                }
              
               for(int j=1;j<=2*i-1;j++)
               {     
                if(i<=j)
                {
                   
                    System.out.print((char)(p+(1*(j-i))));
    
                }
                else
                {
                    System.out.print((char)(p+(i-j)));
                    
                }       
               }
               for(int k=1;k<=i;k++)
               {
                System.out.print("");
               }
                for(int j=1;j<=7-i;j++)
                {
                    System.out.print("*");
                }
               System.out.println();   
            }
            int l=68;
            for(int i=1;i<=4;i++)
            {

                for(int k=1;k<=3+i;k++)
                {
                    System.out.print("*");
                }
                for(int j=1;j<=8-(i+(i-1));j++)
                {
                    if (j<=5-i) {
                      
                        
                    System.out.print((char) (l--));
                            
                           
                    } else {
                        System.out.print((char)(l+(j-4)+i) );
                        
                    }
                }
                for(int k=1;k<=2+i;k++)
                {
                    System.out.print("*");
                } 
                System.out.println();
                l=l+(4-i);     
            }
    
    
    
    
        }
    }
    
