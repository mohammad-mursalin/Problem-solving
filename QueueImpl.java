class Queue {
    int[] queue = new int[6];
    int size;
    int front;
    int rear;

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("The queue is full");
        } else {
            queue[rear] = data;
            rear = (rear + 1) % 6;
            size++;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println(queue[front]);
            front = (front + 1) % 6;
            size--;
        }
    }

    public void size() {
        System.out.println("Size of the queue : " + size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == 6;
    }

    public void show() {
        System.out.print("Elements in the queue : ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % 6] + " ");
        }
        System.out.println();
    }
}
public class QueueImpl {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(1);
        queue.enqueue(11);
        queue.size();
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.size();
    }
}
