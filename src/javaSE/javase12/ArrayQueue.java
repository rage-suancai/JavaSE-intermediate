package javaSE.javase12;

import javaSE.javase9.AbstractList;

public class ArrayQueue<E> extends AbstractQueue<E> {

    private Object[] arr = new Object[4]; // 底层数组
    private int head = 0, tail = 0; // 队尾队首下标

    @Override
    public void affer(E e) {

        int next = (tail+1) % arr.length;
        if (next == head) return;
        arr[tail] = e;
        tail = next;

    }

    @Override
    public E poll() {

        E e = (E) arr[head];
        head = (head+1) % arr.length;
        return e;

    }

}
