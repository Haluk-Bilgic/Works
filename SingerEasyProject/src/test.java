import java.util.Scanner;


public class test {
	private static Singers singers=new Singers();
	private static Scanner scan=new Scanner(System.in);
	
	public static void printOperations(){
		System.out.println("\t 0-Show operations");
		System.out.println("\t 1-Display singers");
		System.out.println("\t 2-Add singers");
		System.out.println("\t 3-Update singers");
		System.out.println("\t 4-Remove singers");
		System.out.println("\t 5-Search singers");
		System.out.println("\t 6-Log out");
	}
	public static void displaySingers(){
		singers.print();
	}public static void addSingers(){
		System.out.println("Enter the name of the singers");
		String name=scan.nextLine();
		singers.add(name);
	}public static void updateSingers(){
		System.out.println("In what order is the singer you want to update?");
		int order=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the name of the new singer");
		String newName=scan.nextLine();
		singers.update(newName, order-1);
	}public static void removeSingers(){
		System.out.println("In what order is the singer you want to delete?");
		int order=scan.nextInt();
		singers.remove(order-1);
	}public static void searchSingers(){
		System.out.println("What is the name of the singer you want to search?");
		String nameOfSinger=scan.nextLine();
		singers.search(nameOfSinger);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\t Welcome to singer app");
		System.out.println("**************************");
		printOperations();
		System.out.println("**************************");
 
		boolean exit=false;
		
		while(!exit){
			System.out.println("choose a operation");
			int operation=scan.nextInt();
			scan.nextLine();
			
			switch(operation){
			case 0:
				printOperations();
				break;
			case 1:
				displaySingers();
				break;
			case 2:
				addSingers();
				break;
			case 3:
				updateSingers();
				break;
			case 4:
				removeSingers();
				break;
			case 5:
				searchSingers();
				break;
			case 6:
				exit=true;
				System.out.println("Exiting the application...");
				break;
			}
		}
		
		
		
		
	}

}
