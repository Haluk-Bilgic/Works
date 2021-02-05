package ds;

import java.util.Scanner;

public class Calculator {

	public static int add(int a,int b){
		return a+b;
	}public static int subtract(int a,int b){
		return a-b;
	}public static int multiply(int a,int b){
		return a*b;
	}public static int divide(int a,int b){
		return a/b;
	}public static int add(int a,int b,int c){
		return a+b+c;
	}public static int multiply(int a,int b,int c){
		return a*b*c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
String operationes="1-Addition\n"
                +"2-Subtraction\n"
                +"3-Multiplication\n"
                +"4-Dividing\n"
                +"Press\"q\" for exit";
System.out.println("***********************");
System.out.println(operationes);
System.out.println("***********************");
while(true){
	System.out.print("Choose your process:");
String iþlem=scan.nextLine();
if(iþlem.equals("q")){
	System.out.println("programme is finished");break;
}
else if(iþlem.equals("1")){
	System.out.println("How many numbers do you want to add?(2 or 3)");
int value=scan.nextInt();
if(value==2){
System.out.print("a:");
int a=scan.nextInt();
System.out.print("b:");
int b=scan.nextInt();
scan.nextLine();
System.out.println("Result:"+add(a,b));
}
else if(value==3){
	System.out.print("a:");
	int a=scan.nextInt();
	System.out.print("b:");
	int b=scan.nextInt();
	System.out.print("c:");
	int c=scan.nextInt();
	scan.nextLine();
	System.out.println("Result:"+add(a,b,c));
}
else{
	System.out.println("Value not found");
	scan.nextLine();
}
}
else if(iþlem.equals("2")){
	System.out.print("a:");
	int a=scan.nextInt();
	System.out.print("b:");
	int b=scan.nextInt();
	scan.nextLine();
	System.out.println("Result:"+subtract(a,b));
}
else if(iþlem.equals("3")){
	System.out.println("How many numbers do you want to multiply(2 or 3)");
int deger=scan.nextInt();
if(deger==2){
System.out.print("a:");
int a=scan.nextInt();
System.out.print("b:");
int b=scan.nextInt();
scan.nextLine();
System.out.println("Result:"+multiply(a,b));
}
else if(deger==3){
	System.out.print("a:");
	int a=scan.nextInt();
	System.out.print("b:");
	int b=scan.nextInt();
	System.out.print("c:");
	int c=scan.nextInt();
	scan.nextLine();
	System.out.println("Result:"+multiply(a,b,c));
}
else {
	System.out.println("Value not found");
	scan.nextLine();
}
}
else if(iþlem.equals("4")){
	System.out.print("a:");
	int a=scan.nextInt();
	System.out.print("b:");
	int b=scan.nextInt();
	scan.nextLine();
	System.out.println("Result:"+divide(a,b));
}
else{
	System.out.println("Ýnvalid Transaction");
}
}
		
	}

}
