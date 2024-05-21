
import java.util.*;

public class Vector1 {
	public static void main(String args[]) {
		
		Vector<String> v=new Vector();
		
		v.add("sunanth");
		v.add("mahi");
		v.add("dhoni");
		v.add("mahender");
		
		Iterator<String> itr=v.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		
		}
		
	}

}
