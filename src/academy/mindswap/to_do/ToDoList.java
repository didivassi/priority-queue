package academy.mindswap.to_do;

import java.util.PriorityQueue;
import java.util.Queue;

public class ToDoList{
	private Queue<ToDo> todolist;

	public ToDoList() {
		this.todolist = new PriorityQueue<>();

	}

	public void add(ToDo toDo) {
		todolist.add(toDo);
		System.out.println("You have " + todolist.size() + " tasks left to do.");
	}

	public ToDo performTask() {
		ToDo tempTask = todolist.poll();
		System.out.println("--------------------------------\n" +
				"Doing task: \n" +
				tempTask.getDescription() +
				"\n--------------------------------");
		System.out.println("You have " + todolist.size() + " tasks left to do.");
		return tempTask;

	}

	public void printList() {
		System.out.println(todolist);
	}
}
