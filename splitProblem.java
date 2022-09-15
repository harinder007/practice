
/*Take email as user input and print the email company name.
Output- 
Enter an email- harinder007@gmail.com
Mail company- gmail */



import java.util.*;
public class splitProblem {
    public static void main(String args[]){
        System.out.println("Enter your gamil : ");
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] result = st.split("@");

             for(String s:result){
            //System.out.println(s);

        }
                      //storing the value after @ in another variable
        String st2=result[1];
        //System.out.println("Result after @ : "+st2);
                    //splitting the value after . and stre in another array
        String[] result2 = st2.split("[.]");

        for(String L:result2){
            //System.out.println(L);

        }
        String snew=result2[0];
       System.out.println("company name of your email : "+snew);
    }
    
}
