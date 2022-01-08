package StackWithPeakPush;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExercise {

	public static void main(String[] args) {
		
		
		Queue <String> Temp2= new PriorityQueue<>();
		Temp2.add("1");
		Temp2.add("2");
		
		System.out.println(Temp2);
		System.out.println(Temp2.peek());// give value that stored first oposite of stack which get last one
		System.out.println(Temp2.poll());// FIFO, get you and delete it
		System.out.println(Temp2.poll());
		System.out.println(Temp2.poll());
		

	}

}
