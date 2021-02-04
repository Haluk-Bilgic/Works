import java.util.Scanner;


public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bes Basamakli Bir Sayi Giriniz:");
		int sayi=scan.nextInt();
	
		int a=sayi/10000;
		int b=(sayi%10000)/1000;
		int d=(sayi%100)/10;
		int e=sayi%10;
		
		if(a==e&&b==d){
			System.out.println("Bu Sayi palindorem sayisidir..");
		}else{
			System.out.println("Bu Sayi palindorem sayisi degildir..");
			
		}
		
		
	}

}
