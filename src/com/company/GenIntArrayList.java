package com.company;

public class GenIntArrayList<E> implements GenIntList<E> {

    private Object[] arr;
    private int size = 0;

    GenIntArrayList() {
        arr = new Object[10];
    }

    @Override
    public void add(E e) {
        if (size >= arr.length) {
            resize();
        }
        arr[size] = e;
        size++;
    }

    @Override
    public void add(int index, E e) {
        check(index);
        if (size >= arr.length) {
            resize();
        }
        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = e;
        size++;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E get(int index) {
        check(index);
        return (E) arr[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean remove(int index) {
        check(index);
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        size--;
        return true;
    }

    @Override
    public boolean removeElement(E e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                System.arraycopy(arr, i + 1, arr, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public void set(int index, E e) {
        check(index);
        arr[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void check(int index) {
        if (index < 0 || index > size - 1) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(", ");
        }
        if (size != 0) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    private void resize() {
        int newSize = arr.length * 3 / 2 + 1;
        System.out.println("newSize: " + newSize);
        Object[] newArr = new Object[newSize];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }
}