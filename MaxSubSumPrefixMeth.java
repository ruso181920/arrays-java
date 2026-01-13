public class MaxSubSumPrefixMeth {
    public static void SumsubArray(int number[]){
        int CurrSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++) {
            prefix[i]=prefix[i-1]+number[i];
        }

        for(int i=0;i<=number.length-1;i++) {
        int start=i;
        for(int j=i;j<=number.length-1;j++){
            int end=j;
            CurrSum= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
           
        if(maxSum<CurrSum) {
            maxSum=CurrSum;
        }
        }
     }
      System.out.println("max sum :"+maxSum);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        SumsubArray(number);
        
     } 

}
