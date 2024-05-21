
import java.util.*;

public class Collection1 {
	public static void main(String args[]) {
		
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Mahi");
		list.add("Dhoni");
		list.add("Sunanth");
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.next());
			
		}
	}

}
