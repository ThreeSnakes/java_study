package algorithm;

import java.util.ArrayList;
import java.util.LinkedList;

class LinkedListQueue<T> {
    private final LinkedList<T> queue = new LinkedList<T>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.poll();
    }
}

class ArraytListQueue<T> {
    private final ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T data) {
        queue.add(data);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        }

        // ArrayList를 사용하는 경우 0번째 Index를 지정해줘야 한다. 이는 배열과 유사한 자룍조이기 때문에 그렇다.
        return queue.remove(0);
    }
}

public class SampleQueue<T> {
    public static void main(String[] args) {
        LinkedListQueue<Integer> myQueue = new LinkedListQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

        ArraytListQueue<String> myQueue2 = new ArraytListQueue<>();
        myQueue2.enqueue("TEST");
        myQueue2.enqueue("HELLO");
        myQueue2.enqueue("JAVA");
        System.out.println(myQueue2.dequeue());
        System.out.println(myQueue2.dequeue());
        System.out.println(myQueue2.dequeue());
        System.out.println(myQueue2.dequeue());
    }
}
