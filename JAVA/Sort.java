import javax.sound.midi.Track;

class Sort
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,34};
        boolean isSorted=false;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                isSorted=true;
                break;
            }
            if(isSorted)
            {
                System.out.println("The array is sorte ");
            }
            else
            {
                System.out.println("the array is not sorted");
            }
        }
    }
}