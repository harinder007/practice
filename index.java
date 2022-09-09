import java.util.*;
public class index {
    public static void main(String args[]){
        System.out.println("enter your name :");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
System.out.println(str);
System.out.println("enter any character whose index you want to find out :");
String c=sc.nextLine();

System.out.println(" index is :"+str.indexOf('c'));
    }
    
}
