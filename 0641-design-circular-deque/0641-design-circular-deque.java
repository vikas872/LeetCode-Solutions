class MyCircularDeque {
    int[] arr;
    int cap;
    int rear;
    int front;
    int size;

    public MyCircularDeque(int k) {
        arr = new int[k];
        cap = k;
        size = 0;
        front = 0;
        rear = k - 1;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + cap) % cap;
        arr[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % cap;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % cap;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) return false;
        // FIX: Handle negative wrapping
        rear = (rear - 1 + cap) % cap;
        size--;
        return true;
    }
    
    public int getFront() {
        // FIX: Correct ternary syntax
        return isEmpty() ? -1 : arr[front];
    }
    
    public int getRear() {
        // FIX: Correct ternary syntax
        return isEmpty() ? -1 : arr[rear];
    }
    
    public boolean isEmpty() {
        // FIX: Empty means size is 0
        return size == 0;
    }
    
    public boolean isFull() {
        // FIX: Full means size equals capacity
        return size == cap;
    }
}