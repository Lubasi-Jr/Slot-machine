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

    public void colour(){
        String entry;
        for(int i =0;i<images.length;i++){
            entry = colours[i]+"|"+images[i]+"|"+RESET;
            images[i] = entry;

        }

    }

    public void print_colours(){
        for (String item : images) {
            System.out.print(item+" ");
            
        }
    }

    public static void main(String[] args) {
        Slot_Machine obj1 = new Slot_Machine();
        obj1.print_colours();

        
    }
    
}
