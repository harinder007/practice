public class split {
    public static void main(String args[]){
        String str="hello harinder yadav";
        
        // splitting the string by spaces 

        String[] result = str.split(" ");
        for(String output:result){
            System.out.println(output);
        }

    }
    
}
