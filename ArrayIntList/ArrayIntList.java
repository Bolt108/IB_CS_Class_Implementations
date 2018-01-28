public class ArrayIntList(){

    private int[] Array;
    private int numElements;
    private int size;

    public ArrayIntList(){

        Array = new int[10];
        numElements = 0;
        this.size = 10;

    }

    public ArrayIntList(int s){

        Array = new int[size];
        numElements = 0;
        size = s;

    }

    public void add (int value){

        list[size] = value;
        size++

    }

    public String toString(){

        if (size == 0){

            return "[]";

        }
        String array = "[";
        for (int i = 0; i < size; i++){

            if (i == size-1){

                array = array + Integer.toString(Array[i]) + "]";

            }

            array = array + Integer.toString(Array[i]) + ",";


        }

        return array;

    }

    public void add(int index, int value){

        for (int i = size; i > index; i--){

            list[i] = list[i-1];
        }

        list[index] = value;
        size++;

    }

    public int get(int index){

        return Array[index];

    }

    public void set(int index, int value){

        Array[index] = value;

    }

    public int size(){

        return size;

    }

    public boolean isEmpty(){

        if (size == 0){

            return true;
        }
        else {

            return false;

        }

    }

    public void remove(int index){

        for (int i = index; i < size; i++){

            list[i] = list[i+1]
        }

        size--;
        list[size] = 0;

    }
}