public class MaxSubArraySum {
    
    public static void SumsubArray(int number[]){
        int CurrSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<=number.length-1;i++) {
        int start=i;
        for(int j=i;j<=number.length-1;j++){
            int end=j;
            CurrSum=0;
             for(int k=start;k<=end;k++){
                CurrSum+=number[k];
        }
        System.out.println("sum is: "+CurrSum);
        if(maxSum<CurrSum) {
            maxSum=CurrSum;
        }
        }
        System.out.println("max sum :"+maxSum);
     }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        SumsubArray(number);
        
     } 

}


