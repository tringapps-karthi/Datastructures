package data;
import java.util.*;
public class List {
               int ch;
               Scanner s=new Scanner(System.in);
	private class Node {
		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int size() {
		return size;
	}

	public int addFirst() {

		if (size == 0) {
                                       System.out.println("List is Empty.");
		}

		return head.data;

	}

	public int addLast()  {

		if (size == 0) {
			System.out.println("List is Empty.");
		}

		return tail.data;

	}

	public int addAt(int idx)  {

		if (size == 0) {
			System.out.println("LL is Empty.");
		}

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index.");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp.data;

	}

	private Node getNodeAt(int idx)  {

		if (size == 0) {
			System.out.println("LL is Empty.");
		}

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index.");
		}

		Node temp = head;

		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}

		return temp;

	}

	public void addLast(int item) {

		
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		
		if (size > 0)
			tail.next = nn;

		
		if (size == 0) {
			head = nn;
			tail = nn;
			size += 1;
		} else {
			tail = nn;
			size += 1;
		}

	}

	public void addFirst(int item) {

		
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		
		nn.next = head;


		if (size == 0) {
			head = nn;
			tail = nn;
			size++;
		} else {
			head = nn;
			size++;
		}

	}

	public void addAt(int item, int idx)  {

		if (idx < 0 || idx > size) {
			System.out.println("Invalid Index.");
		}

		if (idx == 0) {
			addFirst(item);
		} else if (idx == size) {
			addLast(item);
		} else {

		
			Node nn = new Node();
			nn.data = item;
			nn.next = null;


			Node nm1 = getNodeAt(idx - 1);
			Node np1 = nm1.next;

			nm1.next = nn;
			nn.next = np1;

		
			size++;
		}

	}

	public int removeFirst() {

		if (size == 0) {
		             System.out.println("LL is empty.");
		}

		Node temp = head;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			head = head.next;
			size--;
		}
		return temp.data;
	}

	public int removeLast() {

		if (size == 0) {
			System.out.println("LL is empty.");
		}

		Node temp = tail;

		if (size == 1) {
			head = null;
			tail = null;
			size = 0;
		} else {
			Node sm2 = getNodeAt(size - 2);
			sm2.next = null;
			tail = sm2;
			size--;
		}
		return temp.data;
	}

	public int removeAt(int idx) {

		if (size == 0) {
			System.out.println("LL is empty.");
		}

		if (idx < 0 || idx >= size) {
			System.out.println("Invalid Index.");
		}

		if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();

		} else {

			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;

			return n.data;

		}

	}

	public void display() {

		System.out.println("----------------------");
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(".");
		System.out.println("----------------------");

	}
       public  void callList()
           {    
                 
               do{
                    System.out.println("1.Add first  2.Add last  3.Add at  4.Remove first  5.Remove last  6.Remove at  7.Display........");
                    System.out.println("which action you want to perform");
                    ch=s.nextInt();
                    switch(ch)
                    {
                         case 1:  System.out.println("enter your element:");
                                      int ele1=s.nextInt();
                                       addFirst(ele1);
                                       break;
                          case 2:  System.out.println("enter your element:");
                                       int ele2=s.nextInt();
                                       addLast(ele2);
                                       break;
                           case 3: System.out.println("enter your element: and index:");
                                       int ele3=s.nextInt();
                                       int index1=s.nextInt();
                                       addAt(ele3,index1);
                                        break;
                             case 4:  System.out.println(removeFirst());
                                          break;
                              case 5: System.out.println(removeLast());
                                          break;
                              case 6: System.out.println("enter the index which element do you remove :");
                                          int index=s.nextInt();
                                          System.out.println(removeAt(index));
                                          break; 
                              case 7: display();
                                          break;
                              default:  System.out.println("Please enter the valid choice");
                                          break;
                           }
                   }while(ch<=7);
           }                             
}