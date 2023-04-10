import java.util.*;
public class VowelReplace {
    public static void main(String ar[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=sc.nextLine();
        //sc.close();

        char[] arr = str.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u'){
                char temp=arr[i];
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u'){
                        char temp1 = arr[j];
                        arr[i] = temp1;
                        arr[j] = temp;
                        //break;
                    }     
                }  
            }

        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
