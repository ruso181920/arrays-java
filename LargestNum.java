public class LargestNum {
     public static int largestNum(int number[]){
        int biggestNum=number[0];
        int smallestNum=number[0];
        for(int i=1;i<number.length;i++) {
            if(biggestNum<number[i]){
                biggestNum=number[i]; //  integer.Min_Value=-infinite and vice versa for infinite,must import from util.*;
            }

        }
         for(int i=1;i<number.length;i++) {
            if(smallestNum>number[i]){
                smallestNum=number[i]; //  integer.Min_Value=-infinite and vice versa for infinite,must import from util.*;
            }

        }
        System.out.println("The smallest num is :"+ smallestNum);
        return biggestNum;
    }
    public static void main(String[] args) {
        int number[]={97,95,99,45600,32,43,765,346,2100005,5421};
        
       int largest=largestNum(number);
       System.out.println("The largest number is : "+ largest);

        
    }

}
