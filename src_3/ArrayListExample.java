import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

	public void print() { 
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Double> list2=new ArrayList<Double>();
		ArrayList<String> list3=new ArrayList<String>(); 
		//ArrayList<Float> list4=new ArrayList<Float>();
		
		
		/* list.add(45);
		   list.add(78);
		   list.add(180);
		   list.add(600);*/ 
		//System.out.println(list.get(3)); 
		list3.add("Sakib");
		list.add(89);
		list2.add(3.5);
		
		list3.add("Tamim");
		list.add(90);
		list2.add(3.6); 
		Scanner in=new Scanner(System.in);
		for(int count=0;count<2;count++) {System.out.println( "Enter name,numberjcgpa " );
		list3.add(in.next());
		list.add(in.nextInt());
		list2.add(in.nextDouble()); 
		} 
		for(int count=0;count<list.size();count++) { 
			
			if(list.get(count)%2==0) {
			System.out.println(list3.get(count)+" "+list.get(count)+" "+list2.get(count));
			}
		}
}

}
