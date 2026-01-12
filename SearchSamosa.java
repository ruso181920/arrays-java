import java.util.Scanner;

public class SearchSamosa {
     public static int linearSearch(String items[],String key){
        for(int i=0;i<items.length;i++) {
            if (items[i].equals(key)) {
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String items[]={"Rasogulla","Kachodi","Ice-Cream","Burger","Samosa","Jalebi","Pasta"};
        Scanner inp=new Scanner(System.in);
        System.out.print("Check  the availability item you want to eat: ");
        String key=inp.nextLine();
        
       int index=linearSearch(items,key);
       if(index==-1) {
        System.out.println("Sorry ! dish is not available. ");
       }
       else{
        System.out.println("Sure! we'll finish your Craving .");
       }

        
    }
}
