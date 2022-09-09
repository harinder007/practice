import java.util.*;
public class factorial {
    public static void main(String args[]){
        System.out.println("Enter a no.");
        Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int result=1;
       for(int i=1;i<=num;i++){
        result=result*i;
       }
       System.out.println("factorial of "+num+" is = "+result);

    }
}
