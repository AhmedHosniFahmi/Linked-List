// linked list implmentation
public class Main {
public static void main(String[] args) {

	LinkedList<Integer> list = new LinkedList<>();
	list.addLast(2);
	list.addLast(3);
	list.addLast(4);
	list.addFirst(1);
	list.add(5);
	list.addIndex(11, 0);
	list.addIndex(12, 2);
	list.addIndex(6, 7);
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeFirst();
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeLast();
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeIndex(0);
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeIndex(4);
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeIndex(2);
	System.out.println(list.getSize());
	System.out.println(list.toString());
	list.removeIndex(1);
	System.out.println(list.getSize());
	System.out.println(list.toString());
				
	
  }

}
