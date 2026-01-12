import java.util.*;
public class BinarySearch { 
    public static int binarySearch(int number[],int key){
        int start=0;
        int end=number.length-1;
        while(start<=end) {
            int midIndx =(start+end)/2;
            if (number[midIndx]==key) {
                return midIndx; 
            }
            if (number[midIndx]<key){
                 start=midIndx+1;
            }
            else {
                end=midIndx-1;
               
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        // items must be sorted 
        int number[]={32,45,97,99,123,546,657,2105,5421};
       
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the num you want to search:");
        int key=inp.nextInt();
        
       int index=binarySearch(number,key);
       if(index==-1) {
        System.out.println("Not found ");
       }
       else{
        System.out.println("found at index :"+index);
       }

        
    }
}



