
public class ReverseArray {
    public static void reverseArray(int number[]){
     int start=0;
     int end=number.length-1;
     while(start<end) {
        int temp=number[start];
        number[start]=number[end];
        number[end]=temp;
        start++;
        end--;
        
     }

    }
    public static void main(String[] args) {
        int number[]={97,95,99,456,32,43,765,346,2105,5421};
        System.out.print("Reversed array : "); 
        reverseArray(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+",");
        }   
     }
}
