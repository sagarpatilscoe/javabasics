import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 */

/**
 * @author spatil28
 *
 */
public class MiddleElement {

	List<String> ele = new LinkedList(Arrays.asList("a","b","c"));
	

	public static void main(String args[]) {
		Node n1 = new Node();
		Node n2 = new Node();
		n1.next=n2;
		Node n3= new Node();
		n2.next=n3;
		n3.next=null;
		
		
		
	}
	
}



class Node {
	int value;
	Node next;
	Node prev;
}



