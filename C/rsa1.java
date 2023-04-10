//package rsa;

public class rsa1 {
	public static void main(String[] args) {
		int p=16,q=5,e,phieofnplus1,d=0;
		int n=p*q;
		int phieofn=(p-1)*(q-1);	
		for (e = 2; e < phieofn; e++) {
			 
            // e is for public key exponent
            if (gcd(e, phieofn) == 1) {
                break;
            }
        }
		System.out.println("Value of e is:"+e);
		
		for(int i=0;i<9;i++)
		{
			int x=1+(i*phieofn);
			if(x%e==0)
			{
				d=x/e;
				break;
			}
			
		}
	
		System.out.println("The public key is:"+d);
	}
	static int gcd(int e,int z)
	{
		if(e==0)
			return z;
		else
			return gcd(z%e,e);
	}
}