public class patt13 {
    public static void main(String[] args)
    {
        int a=65;
        for(int i=1;i<=5;i++)
        {
            
            for(int j=1;j<=6-i;j++)
            {
                System.out.print((char)a++);
            }
            System.out.println();
            a=65+i;
        }
    }
    
}
