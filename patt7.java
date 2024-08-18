
public class patt7 {
    public static void main(String[] args)
    {
        int a=0,b=1;

    for(int i=1;i<=5;i++)
    {
        for(int k=1;k<=i-1;k++)
        {
            System.out.print(a);
        }
        for(int j=1;j<=6-i;j++)
        {
            System.out.print(b);
        }
        System.out.println();
    }
    
}
}
