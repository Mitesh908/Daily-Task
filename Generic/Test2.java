package Assignment_GENERICS;
	public class Main {
		public static void main(String[] args) {
			List<Integer> list = new List<Integer>();
			list.addElement(10);
			list.addElement(20);
			list.addElement(30);
			list.addElement(40);
			list.addAtStart(101);
			list.addAtLast(202);
			list.printAll();
	
			System.out.println("Delete fform the start");
			list.deleteAtStart();
			System.out.println("Print ALL ELMENT");
			list.printAll();
			System.out.println("Delete at end");
			list.deleteAtEnd();
			list.deleteAt(2);
			System.out.println("");
			list.printAll();
		}
	}
