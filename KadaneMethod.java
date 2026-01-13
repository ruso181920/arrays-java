public class KadaneMethod {
    public static void kadaneMethod(int numbers[])  {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            ms = Math.max(cs, ms);
            if (cs < 0) {
                cs = 0;
            }
        }
        System.out.println("max sum is :"+ms);

    }
    public static void main(String[] args) {
        

            int numbers[] = {-5, -2, -7 };
            kadaneMethod(numbers);
    }
}
