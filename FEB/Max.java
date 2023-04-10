public class Max 
{
    public static void main(String[] args) 
    {
        int x[]={10,20,30,99,40,50};
        int max=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(max<x[i])
            {
                max=x[i];
            }
        }
        System.out.print("max number "+max);
    }

    
}
