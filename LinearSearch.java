
import java.util.Scanner;

public class LinearSearch {
    

    public static int linearSearch(int number[],int key){
        for(int i=0;i<number.length;i++) {
            if (number[i]==key) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={97,95,99,456,32,43,765,346,2105,5421};
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter the num you want to search: ");
        int key=inp.nextInt();
        
       int index=linearSearch(number,key);
       if(index==-1) {
        System.out.println("Not found ");
       }
       else{
        System.out.println("found at index :"+index);
       }

        
    }
}

