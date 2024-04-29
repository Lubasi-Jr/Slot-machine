import java.util.*;


public class App {
    String RESET = "\u001B[0m";
    String RED = "\u001B[31m";
    String GREEN = "\u001B[32m";
    String YELLOW = "\u001B[33m";
    public static void main(String[] args) throws Exception {
    
        String[] arr1 = new String[3];
        App obj1= new App();

        

        arr1[0] = "[Sausage]";
        arr1[1] = "[Fish]";
        arr1[2] = obj1.GREEN+"[Football]"+obj1.RESET;
        for(int i = 0; i<arr1.length;i++){
            System.out.print(arr1[i]);

        }
        
    }
}
