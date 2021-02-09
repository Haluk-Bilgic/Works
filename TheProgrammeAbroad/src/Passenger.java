import java.util.Scanner;


public class Passenger implements theRulesAbroad{
    
    private int fee;
    private boolean forbidden;
    private boolean stateOfVisa;
    
    public Passenger() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("The fee you deposit : ");
        this.fee = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Do you have any ban(yes or no) ? ");
        
        String reply = scanner.nextLine();
        
        if (reply.equals("yes")) {
            
            this.forbidden = true;
        } 
        else {
            this.forbidden = false;
        }
        System.out.print("Do you have a visa ? (yes or no)");
        
        String reply2 = scanner.nextLine();
        
        if (reply2.equals("yes") ){
            this.stateOfVisa = true;
            
        }
        else {
            this.stateOfVisa = false;
        }
        
        
        
        
        
    }

    public boolean overseasFeeControl() {
        if (this.fee < 15) {
            
            System.out.println("Please deposit fee 15 dollar...");
            return false;
        }
        else {
            System.out.println("The fee is done!");
            return true;
        }
    }

    public boolean forbiddenControl() {
        
        if (this.forbidden == true) {
            System.out.println("You have forbidden!You cannot go abroad...");
            return false;
        }
        else {
            System.out.println("You don't have any forbidden...");
            return true;
        }
    }

    public boolean visaControl() {
        if (this.stateOfVisa == true) {
            
            System.out.println("Operations of visa is done!");
            return true;
        }
        else {
            System.out.println("you don't any visa'you cannot go abroad...");
            return false;
        }

    }
    
    
}
