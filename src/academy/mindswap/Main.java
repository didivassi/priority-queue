package academy.mindswap;

import academy.mindswap.to_do.ToDo;
import academy.mindswap.to_do.ToDoList;

public class Main {
	public static void main(String[] args) {
		ToDoList t = new ToDoList();
		t.add(new ToDo("buy eggs", 2, "high"));
		t.add(new ToDo("take garbage out", 3, "medium"));
		t.add(new ToDo("take dog out", 1, "medium"));

		t.performTask();
		t.performTask();
		t.performTask();

		t.printList();
	}
}
