
public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Welcome To The Airport....");
        
        String conditions = "Abroad Exit Rules...\n"
                         +"You shouldn't have any ban...\n"
                         +"You have to pay the fee 15 dollar...\n"
                         +"You must have your visa...";
        String message = "You must meet all of these rules";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(conditions);
            System.out.println("*******************************************");
            
            
            Passenger passenger = new Passenger();
            
            System.out.println("Tuition fee is controlled...");
            
            Thread.sleep(3000);
            if (passenger.overseasFeeControl() == false) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Overseas ban is controlled...");
            Thread.sleep(3000);
            
            if (passenger.forbiddenControl() == false) {
                System.out.println(message);
                continue;
            }
            System.out.println("The state of visa is controlled...");
            Thread.sleep(3000);
            
            if (passenger.visaControl() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("Operations are done!Good bye...");
            break;
            
            
        }
        
        
    }
}