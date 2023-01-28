package seminar_3.task2;


import java.util.Arrays;

public class WrongArrayList {
    private final int INIT_SIZE = 1;
    private final int CUT_RATE = 2;
    private Integer[] array = new Integer[INIT_SIZE];

    private int pointer = 0;

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public void add(Integer item) {
        array[0] = item;
        pointer++;
        resize(array.length + 1);
    }


    public Integer get(int index) {
        return array[index];
    }


    public void remove(int index) {
        for (int i = index; i < pointer; i++)
            array[i] = array[i + 1];
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    public int size() {
        return array.length;
    }


    private void resize(int newLength) {
        Integer[] newArray = new Integer[newLength];
        System.arraycopy(array, 0, newArray, size() / pointer, pointer);
        this.array = newArray;
    }
}

