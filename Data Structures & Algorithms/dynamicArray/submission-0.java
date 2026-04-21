class DynamicArray {
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(int capacity) {

        if(capacity <= 0) capacity = 1;
        this.capacity = capacity;
        this.data = new int[capacity];
        this.size = 0;

    }

    public int get(int i) {
        checkIndex(i);
        return data[i];
    }

    public void set(int i, int n) {
        checkIndex(i);
        data[i] = n;
    }

    public void pushback(int n) {
        if(size == capacity){
            resize(); 
        }
        data[size] = n;
        size++;
    }

    public int popback() {
        if(size == 0) throw new NoSuchElementException("DynamicArray is empty");
        int val = data[size-1];
        data[size-1] = 0;
        size--;

        return val;
    }

    private void resize() {
        int newCapacity = Math.max(1, capacity*2);
        int[] newData = new int[newCapacity];

        System.arraycopy(data, 0, newData, 0, size);
        data = newData;
        capacity = newCapacity;

    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
    
    private void checkIndex(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(
                "Index: " + i + ", Size: " + size
            );
        }
    }
}
