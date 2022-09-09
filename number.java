import java.util.*;
public class number {
    public static void main(String args[]){
        
        for(int num=1; num<=100; num++){
        if(num%3==0 && num%5==0){
            System.out.print("CodeQuotient");

        }
        else if(num%5==0){
            System.out.println("Quotient");
        }
        else if(num%3==0){
            System.out.println("Code");
        }
        else{ 
            System.out.println(num);
        }

    }

}
}