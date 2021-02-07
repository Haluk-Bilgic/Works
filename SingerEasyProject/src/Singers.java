import java.util.ArrayList;


public class Singers {
private ArrayList<String> listOfSingers=new ArrayList<String>();
	
	public void print(){
		System.out.println("There are "+listOfSingers.size()+" singers on the list");
		for(int i=0;i<listOfSingers.size();i++){
			System.out.println("Singer no."+(i+1)+" :"+listOfSingers.get(i));
		}
	}
	public void add(String name){
		listOfSingers.add(name);
		System.out.println("The list is updated...");
	}
	public void update(String newName,int order){
		listOfSingers.set(order, newName);
		System.out.println("The list is updated...");
	}
	public void remove(int order){
		String isim=listOfSingers.get(order);
		if(listOfSingers.size()>=order){
			listOfSingers.remove(order);
		System.out.println(isim+" is deleted ");
		}else{
			System.out.println("no singer found");
		}
	}
	public void search(String nameOfSinger){
		int order=listOfSingers.indexOf(nameOfSinger);
		if(order>=0){
			System.out.println("singer found");
			System.out.println("Order of "+nameOfSinger+":"+(order+1));
		}else{
			System.out.println("no singer found..");
		}
	}
	
	
}
