import java.text.DecimalFormat;
import java.util.Scanner;


public class DistributionOfVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double total=0;
	Scanner scan=new Scanner(System.in);
	DecimalFormat format=new DecimalFormat("##.##");
	 	int [] numOfVote=new int[6];
	    int[] numOfParty=new int[6];
	 	for(int i=0;i<numOfVote.length;i++){
		System.out.print(" Enter The Number Of Votes Of Political Party no."+(i+1)+":");
		numOfVote[i]=scan.nextInt();
		total+=numOfVote[i];
		numOfParty[i]=i+1;
	}
	int a=0;
	int b=0;
		for(int i=0;i<numOfVote.length-1;i++){
			for(int j=0;j<numOfVote.length-i-1;j++){
				
				if(numOfVote[j]<numOfVote[j+1]){
					a=numOfVote[j];
					numOfVote[j]=numOfVote[j+1];
					numOfVote[j+1]=a;
					
					b=numOfParty[j];
					numOfParty[j]=numOfParty[j+1];
					numOfParty[j+1]=b;
				}
			}
		}
System.out.println("               ORDERED DISTRIBUTION OF VOTES\n");
System.out.println("Name Of Party\tNumber Of Vote\tVote Rate");
double son=0;
for(int i=0;i<6;i++){
	son=(numOfVote[i]/total)*100;
System.out.println("Party no."+numOfParty[i]+":"+"\t   "+numOfVote[i]+"\t\t"+" %"+format.format(son));
}
		
		
		
		
	}

}
