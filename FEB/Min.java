public class Min
 {
    public static void main(String[] args)
     {
       // Scanner sc = new Scanner(System.in);
        int x[] ={99,88,88,5,33,44};
        int  min=x[0];
        for(int i=0;i<x.length;i++)
        {
            if(min>x[i])
            {
                min=x[i];
            }
        }
        System.out.print("min number :"+min);
    }
    
}
