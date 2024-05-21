
import java.util.*;

public class Stack1 {
 
	public static void main(String args[]) {
	 
	 Stack<String> stack=new Stack <String>();
	 
	 stack.push("Mahi");
	 stack.push("Sunanth");
	 stack.push("mani");
	 stack.push("ramu");
	 stack.push("naveen");
	 
	 stack.pop();
	 	 
	 Iterator<String> itr=stack.iterator();
	 
	 while(itr.hasNext()) {
		 
		 System.out.println(itr.next());
		 
	 }
	 
   }
}
