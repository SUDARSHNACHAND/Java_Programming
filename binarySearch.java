import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int arr[]={2,9,5,10,23,50,100,39,66,69};
	int tar=39;
	int start=0,end=arr.length-1,mid;
	while(start<=end){
	mid=(start+end)/2;
	 if(tar==arr[mid]){
	     System.out.print(mid);
	     return;
	     
	 }
	else if(arr[mid]<tar)
	start=mid+1;
	else if(arr[mid]>tar)
	    end=mid-1; 
	}
	System.out.println(-1);
	}
}
