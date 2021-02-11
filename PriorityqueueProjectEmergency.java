
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



class Patient implements Comparable<Patient>{
	private String name;
	private String disease;
    private int priority;
	public Patient(String name, String disease) {
		this.name = name;
		this.disease = disease;
      if(disease.equals("Appendicities")){
    	  this.priority=3;
      }else if(disease.equals("Headache")){
    	  this.priority=1;
      }else {
    	  this.priority=2;
      }
	}
	@Override
	public String toString() {
		String info="Patient name:"+name+
				"\ndisease:"+disease+
				"\npriority:"+priority; 
		return info;
	}
	public int compareTo(Patient patient) {
		if(this.priority>patient.priority){
			return -1;
		}else if(this.priority<patient.priority){
			return 1;
		}
		return 0;
	}
}
public class PriorityqueueProjectEmergency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Patient>patient=new PriorityQueue<Patient>();
		
		patient.offer(new Patient("Mehmet","Appendicities"));
		patient.offer(new Patient("sultan","Headache"));
		patient.offer(new Patient("haluk","Appendicities"));
		patient.offer(new Patient("sude","Burned"));
		patient.offer(new Patient("Mustafa","Burned"));
		
		int i=1;
		while(!patient.isEmpty()){
			System.out.println("*********************");
			System.out.println("Patient id:"+i);
			System.out.println(patient.poll());
			System.out.println("*********************");
			i++;
			
			
		}
		
	}

}
