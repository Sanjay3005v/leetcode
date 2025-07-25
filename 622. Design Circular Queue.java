//622. Design Circular Queue



class MyCircularQueue {
    int[] arr;
    int rear = -1;
    int front = 0;
    int size = 0;

    public MyCircularQueue(int k) {
        arr = new int[k];
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % arr.length;
        arr[rear] = value;
        size++;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % arr.length;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

//Using LinkedList
/*class MyCircularQueue {
    class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    Node front;
    Node rear;
    int size;
    int k;
    public MyCircularQueue(int k) {
        this.k=k;
    }

    public boolean enQueue(int value) {
         if(isFull()) {
            return false;
        }
       Node node = new Node(value);
		if (isEmpty()) {
			front = rear = node;
		}
        
        else {
			rear.next = node;
			rear = node;
		}
		size++;
		return true;
    }

    public boolean deQueue() {
        if (isEmpty()) {
			return false;
		}
		if (size == 1) {
			front = null;
			rear = null;
		} else {
			front = front.next;
		}
		size--;
		return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return front.val;
    }

    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return rear.val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == k;
    }
}
*/

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */

