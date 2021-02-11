import java.util.Scanner;
public class aWorkForArray {
	public static void findAverage(double[] a){
		double toplam=0;
		for(int i=0;i<10;i++){
			 toplam+= a[i];
			 }
		System.out.println("Average of numbers:"+(toplam/a.length));
	}
		public static void largeAndSmallNumber(double[] a){
			double total=0;
			int k=0;
			int z=0;
			double small[] = new double[10];
			double big[]=new double [10];
			for(int i=0;i<10;i++){
				 total+= a[i];
				 }
			for(int i=0;i<10;i++){
		     
				if(a[i]<(total/a.length)){
					
			 small[k]=a[i];
			 k++;
		 }
		else {
		    big[z]=a[i];
		    z++;
		 }}
		System.out.println("Numbers bigger than average");
		for(int i=0;i<z;i++){
			System.out.println(big[i]);
		}
		System.out.println("Numbers smaller than average");
		for(int i=0;i<k;i++){
			System.out.println(small[i]);
		}}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 10 decimal numbers");
		double a[]=new double[10];
		for(int i=0;i<10;i++){
		 a[i]=scan.nextDouble();
		}
		findAverage(a);
		largeAndSmallNumber(a);
		
		
		
		
		
		
		
	}

}
