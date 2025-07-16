package com.boranstars.genericity;



import java.util.Arrays;


public class MyArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] array;
    private int size;

    // 默认构造函数
    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    // 指定初始容量的构造函数
    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("初始容量必须大于0");
        }
        this.array = (E[]) new Object[initialCapacity];
        this.size = 0;
    }

    // 添加元素到末尾
    public void add(E element) {
        ensureCapacity(size + 1);
        array[size++] = element;
    }

    // 在指定位置插入元素
    public void add(int index, E element) {
        checkIndexForAdd(index);
        ensureCapacity(size + 1);

        // 将index及之后的元素后移一位
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    // 获取指定位置的元素
    public E get(int index) {
        checkIndex(index);
        return array[index];
    }

    // 修改指定位置的元素
    public E set(int index, E element) {
        checkIndex(index);
        E oldValue = array[index];
        array[index] = element;
        return oldValue;
    }

    // 删除指定位置的元素
    public E remove(int index) {
        checkIndex(index);
        E removedElement = array[index];

        // 将index之后的元素前移一位
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(array, index + 1, array, index, numMoved);
        }

        array[--size] = null; // 清除引用，帮助GC
        return removedElement;
    }

    // 删除指定元素（首次出现）
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if ((o == null && array[i] == null) || (o != null && o.equals(array[i]))) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    // 判断是否包含某元素
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    // 查找元素索引（首次出现）
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if ((o == null && array[i] == null) || (o != null && o.equals(array[i]))) {
                return i;
            }
        }
        return -1;
    }

    // 清空数组
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null; // 帮助GC
        }
        size = 0;
    }

    // 获取当前元素数量
    public int size() {
        return size;
    }

    // 判断是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 扩容检查
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = array.length + (array.length >> 1); // 1.5倍扩容
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            array = Arrays.copyOf(array, newCapacity);
        }
    }

    // 检查索引是否合法（用于get/set/remove）
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("索引越界: " + index + ", 当前大小: " + size);
        }
    }

    // 检查索引是否合法（用于add）
    private void checkIndexForAdd(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("索引越界: " + index + ", 允许范围: 0-" + size);
        }
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
