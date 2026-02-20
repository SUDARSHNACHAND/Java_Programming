import java.util.*;
public class Main{
    public static void main (String[] args) {
    int arr[]={20,21,34,54,97,45,32,10,1,10};
    int target=10;
    int i,j;
    for(i=0;i<arr.length;i++){
        if(arr[i]==target){
            System.out.println("element found "+i+" index");
            return;
        }
    }
    System.out.println("element not found");
        
    }
}    
