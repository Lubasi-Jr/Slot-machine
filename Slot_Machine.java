import java.util.*;
import java.lang.*;
import java.util.random.*;

public class Slot_Machine {
    public String[] images = {"Fish","Basketball","Heart","Peacock","Drink"};

    public String[] colours = {"\u001B[31m","\u001B[32m","\u001B[33m","\u001B[45m","\u001B[46m"};

    String RESET = "\u001B[0m";

    
    

    public int balance;
    Random rand = new Random();

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

    public void deposit(int amount){
        this.balance = this.balance+amount;
    }

    public void withdraw(int amount){
        this.balance = this.balance-amount;
        
    }

    public void spin(){
        ArrayList<String> display = new ArrayList<>(); //Create a new array each time the spin method is called
        double multiplier = 0; //multiplier if spin loses

        for(int i =0;i<3;i++){
            int num = rand.nextInt(5);
            System.out.print(images[num]);
            display.add(images[num]);
            

        }
        

        if( display.get(0).equalsIgnoreCase(display.get(1)) && display.get(1).equalsIgnoreCase(display.get(2)) ){
            //jackpot
            multiplier = 10;
        }
        else{
            for (String img : display) {
                int occurence = Collections.frequency(display, img); //How many times the image is occurs in the row
                if(occurence == 2){
                    multiplier = 2.5;
                    break; //Break loop cause we now it is not a jackpot but has an image appearing twice
                }
                //If if statement above is never met, then row does not have a Jackpot nor twin images. So multiplier remains at 0
                
            }
        }
        System.out.println("Multiplier: "+multiplier);
        System.out.println();
    }

    
    

    public static void main(String[] args) {
        Slot_Machine obj1 = new Slot_Machine();
        Scanner scn = new Scanner(System.in);
        Scanner money = new Scanner(System.in);
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
                //Proper options
                else if(option == 2 ){ 
                    System.out.println("Enter amount:-");
                    int amount = money.nextInt();
                    obj1.deposit(amount);

                    

                }
                else if(option == 3 ){ 
                    System.out.println("Enter amount:-");
                    int amount = money.nextInt();
                    if(amount > obj1.balance){
                        System.out.println("Insufficient funds");
                    }
                    else{
                        obj1.withdraw(amount);
                    }

                    

                }

                else if(option == 1 ){ 
                    obj1.spin();

                    

                }
    
            }
            System.out.println();
            

        }
        scn.close();
        
        

        
    }
    
}
