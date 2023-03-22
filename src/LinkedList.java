public class LinkedList<type> {
	private Node<type> head;
	private Node<type> tail;
	private int size = 0;

	public boolean isEmpty() {
		return (size == 0 && head == null && head == tail);
	}

	public int getSize() {
		return size;
	}

	public void addFirst(type data) {
		Node<type> newNode = new Node<>(data);
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		size++;
	}

	public void addLast(type data) {
		Node<type> newNode = new Node<>(data);
		if (isEmpty()) {
			head = tail = newNode;
			newNode.setNext(null);
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		size++;
	}

	public void add(type data) {
		addLast(data);
	}

	public void addIndex(type data, int index) {
		if (index >= 0 && index <= size) {
			if (index == 0) {
				addFirst(data);
			} else if (index == size) {
				addLast(data);
			} else {
				Node<type> newNode = new Node(data);
				Node<type> current = head;
				size++;
				for (int i = 0; i < index - 1; i++) {
					current = current.getNext();
				}
				newNode.setNext(current.getNext());
				current.setNext(newNode);
			}
		} else {
			System.out.println("you entered unavailable index");
		}
	}

	public void first() {
		if (!isEmpty()) {
			System.out.println(" First element : " + head.getData());
		} else
			System.out.println("the list is empty");
	}

	public void last() {
		if (!isEmpty()) {
			System.out.println(" last element : " + tail.getData());
		} else
			System.out.println("the list is empty");
	}

	public void removeFirst() {
		if (!isEmpty()) {
			head = head.getNext();
			size--;
		} else
			System.out.println("the list is empty");
	}

	public void removeLast() {
		if (!isEmpty()) {
			Node<type> current = head;
			while (current.getNext() != tail) {
				current = current.getNext();
			}
			tail = current;
			current.setNext(null);
			size--;
		} else
			System.out.println("the list is empty");
	}

	public void removeIndex(int index) {
		if (index >= 0 && index < size) {
			if (index == 0) {
				removeFirst();
			} else if (index == size - 1) {
				removeLast();
			} else {
				Node<type> current1 = head;
				for (int i = 0; i < index - 1; i++) {
					current1 = current1.getNext();
				}
				Node<type> current2 = current1.getNext();
				current1.setNext(current2.getNext());
				size--;
			}
		} else if (isEmpty()) {
			System.out.println("the list is empty");
		} else {
			System.out.println("unavailable index");
		}
	}

	public String toString() {
		Node<type> current = head;
		String s = "[ ";
		while (current != null) {
			s += current.getData();
			current = current.getNext();
			if (current != null)
				s += " ,";
		}
		s += " ]";
		return s;
	}
}
