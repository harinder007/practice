import java.util.*;
public class number {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. between 1 to 100");
        int num=sc.nextInt();
        if(num%3==0){
            System.out.println("Code");

        }
        if(num%5==0){
            System.out.println("Quotient");
        }
        if(num%3==0 && num%5==0){
            System.out.print("CodeQuotient");
        }

    }

}
