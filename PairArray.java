public class PairArray {
    
    public static void pairArray(int number[]){
     for(int i=0;i<=number.length-1;i++) {
        for(int j=i+1;j<=number.length-1;j++){
            System.out.print("("+number[i ]+","+number[j]+"),");
        }
        System.out.println();
     }

    }
    public static void main(String[] args) {
        int number[]={97,95,99,456,32,43,765,346,2105,5421};
        System.out.print("Paired array : "); 
        pairArray(number);
        
     }
}
