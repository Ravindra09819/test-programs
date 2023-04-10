import java.util.*;  
public class Secondl2{  
public static int Display(Integer[] a, int total){  
List<Integer> list=Arrays.asList(a);  
Collections.sort(list);  
int element=list.get(total-2);  
return element;  
}  
public static void main(String args[]){  
Integer a[]={1,2,5,6,3,2};  
Integer b[]={44,66,99,77,33,22,55};  
System.out.println("Second Largest: "+Display(a,6));  
System.out.println("Second Largest: "+Display(b,7));  
}}  