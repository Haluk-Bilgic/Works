import java.util.Scanner;


public class SayiYuvarlama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bes basamakli bir tamsayi giriniz");
		int sayi=scan.nextInt();
		int ort=sayi%1000;
		if(ort<=500){
			int a=sayi-ort;
			System.out.println("Girilen "+sayi+" sayisinin yuvarlatilmis hali "+a+" dir.");
		}else{
			int b=1000-ort;
			int x=sayi+b;
			System.out.println("Girilen "+sayi+" sayisinin yuvarlatilmis hali "+x+" dir.");
		}
		
		
	}

}
