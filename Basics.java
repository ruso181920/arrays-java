
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // input - output
        int marks[]=new int [3];// you can create new int [5] of any size even greter then your requirement.
        Scanner inp=new Scanner (System.in);
        System.out.println("Enter marks in Phys:");
        marks[0]=inp.nextInt();
        System.out.println("Enter marks in chem:");
        marks[1]=inp.nextInt();
       System.out.println("Enter marks in Maths:");
         marks[2]=inp.nextInt();
         System.out.println("Phy : "+ marks[0]);
         System.out.println("Chem : "+ marks[1]);
         System.out.println("Math : "+ marks[2]);

         // updating values
         marks[2]=90;
         System.out.println("Maths :"+marks[2]);
   
          marks[2]+=9;
         System.out.println("Maths :"+marks[2]);
        int total=(marks[0]+marks[1]+marks[2]);
         int precentage=total/marks.length;
         System.out.println("Congrats ! you got: " + precentage +" %.");
        }
}
