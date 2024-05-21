
import java.util.*;

public class LinkedList1 {

	public static void main(String args[]) {
		 
		LinkedList<String> list=new LinkedList <String>();
		
		list.add("CSK");
		list.add("mahii");
		list.add("CSK");
		list.add("Sunny");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext()){
		
		System.out.println(itr.next());
		
		}
		
	}
}
