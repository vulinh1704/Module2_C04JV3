package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>(); // Khai báo theo cơ chế của Queue
        myQueue.offer(1); // thêm vào (enqueue)
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek()); // lấy ra phần tử đầu tiên (FIFO) => 1
        System.out.println(myQueue.remove()); // lấy ra và xóa phần tử đầu tiên => 1
        System.out.println(myQueue.remove()); // lấy ra và xóa phần tử đầu tiên => 2
        System.out.println(myQueue.remove()); // lấy ra và xóa phần tử đầu tiên => 3
    }
}
