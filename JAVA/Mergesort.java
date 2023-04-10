

class Mergesort
{
    int array[];
    int tempmergearr[];
    int length;

    public static void main(String args[])
    {
        int inputArr[]={100111,48,36,13,52,19,94,21,1000,101};
        Mergesort ms=new Mergesort();
        ms.sort(inputArr);
        for(int i:inputArr)
        {
            System.out.print(i+" ");
        }
 
    }

    public void sort(int inputArr[])
    {
        this.array=inputArr;
        this.length=inputArr.length;
        this.tempmergearr=new int[length];
        divideArray(0,length-1);
    }

    public void divideArray(int lowerindex,int higherindex)
    {
        if(lowerindex<higherindex)
        {
            int middle=lowerindex +( higherindex-lowerindex )/2;
            //it will sort the left side of an array
            divideArray(lowerindex, middle);
//it will sort the rightside of an array
            divideArray(middle+1, higherindex);

            mergeArray(lowerindex,middle,higherindex);
        }

    }

    public void mergeArray(int lowerindex,int middle,int higherindex)
    {
        for(int i=lowerindex;i<=higherindex;i++)
        {
            tempmergearr[i]=array[i];
        }

        int i=lowerindex;
        int j=middle+1;
        int k=lowerindex;
        while(i<=middle && j<=higherindex)
        {
            if(tempmergearr[i]<=tempmergearr[j])
            {
                array[k]=tempmergearr[i];
                i++;
            }
            else
            {
                array[k]=tempmergearr[j];
                j++;
            }
            k++;

        }

        while(i<=middle)
        {
            array[k]=tempmergearr[i];
            k++;
            i++;
        }
    }
}