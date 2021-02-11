import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Sorting{
	private static int[] sort(int [] array){
		
		int ara;
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					ara=array[j];
					array[j]=array[j+1];
					array[j+1]=ara;
				}
			}
		}
		return array;
	}
	
public static void print(int[] b){
	System.out.println("Sorted by the array");
	for(int i:b){
		System.out.println(i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		System.out.println("Enter count of element:");
		int number=scan.nextInt();
		if(number>50){
			System.out.println("You cannot enter more than 50 counts");
		}else{
		Random random=new Random();
		int [] array=new int[number];
		int[]x=new int [number];
		for(int i=0;i<number;i++){
		 array[i]=1+random.nextInt(100);			
		  x[i]=array[i];
		}
		System.out.println("Automatically generated array");
		for(int i:array){
	System.out.println(i);
		}	
   int[] b=sort(array);
    print(b);
   
    int unchange=0;
    for(int i=0;i<number;i++){
    	if(x[i]==b[i]){
    		unchange++;
    	}
    }
 
    System.out.println("The count of unchanged:"+unchange);

		}
	}



		
		
		
	}

