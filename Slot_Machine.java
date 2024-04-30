import java.util.*;
import java.lang.*;

public class Slot_Machine {
    public String[] images = {"Fish","Basketball","Heart","Hat","Drink"};

    public String[] colours = {"\u001B[31m","\u001B[32m","\u001B[33m","\u001B[45m","\u001B[46m"};

    String RESET = "\u001B[0m";
    

    public int balance;

    public Slot_Machine(){
        this.balance = 0;
        colour();
    }

    public Slot_Machine(int bal){
        this.balance = bal;
        colour();


    }

    public int show_balance(){
        return this.balance;
    }
    public void colour(){
        String entry;
        for(int i =0;i<images.length;i++){
            entry = colours[i]+"|"+images[i]+"|"+RESET;
            images[i] = entry;

        }

    }

    
    

    public static void main(String[] args) {
        Slot_Machine obj1 = new Slot_Machine();
        Scanner scn = new Scanner(System.in);
        String choice = "";

        while (true){

            System.out.println("Enter an option:-\n1)Spin\n2)Deposit\n3)Withdraw\n4)Quit ");
            System.out.println("Balance: "+obj1.balance);
            choice = scn.nextLine();

            if (!(Character.isDigit(choice.charAt(0)))) {
                System.out.println("Invalid entry");
                //continue;
                
            }
            else{

                int option = Integer.parseInt(choice);
                if(option<1 || option>4){
                    System.out.println("Invalid entry");
                    continue;
                }
                else if (option == 4){
    
                    
                    System.out.println("Goodbye!!");
                    break;
    
                }
                else{
                    System.out.println();
                    System.out.println("Your choice is: "+option);

                }
    
            }
            

        }
        scn.close();
        
        

        
    }
    
}
