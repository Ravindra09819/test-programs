import java.util.*;
class Pa
{

public static void main(String args[])
    {
int rows,cols,sum=0;
Scanner sobj=new Scanner(System.in);
System.out.println("Enter number of rows:");
rows=sobj.nextInt();
System.out.println("Enter number of cols:");
cols=sobj.nextInt();

int x[][]=new int[rows][cols];
System.out.println("Enter "+rows*cols +" elements");
for(int i=0;i<rows;i++)
{
    for(int j=0;j<cols;j++)
    {
        x[i][j]=sobj.nextInt();

    }
}
System.out.println("Entered below values:");
for(int i=0;i<rows;i++)
{
    for(int j=0;j<cols;j++)
    {
        System.out.print(" "+x[i][j]);
        

}
System.out.println("Sum is:"+rows);
    }
}
}
