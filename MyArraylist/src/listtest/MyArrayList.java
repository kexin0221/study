package listtest;

import java.util.Arrays;

public class MyArrayList implements Ilist{
    public int[] array;
    public int usedSize;

    public static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.array = new int[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int data) {
        if(isFull()){
            grow(array);
        }
        this.array[usedSize] = data;
        this.usedSize++;
    }

    private void grow(int[] array){
        this.array = Arrays.copyOf(this.array,this.array.length*2);
    }

    @Override
    public boolean isFull() {
        return this.usedSize == this.array.length;
    }

    @Override
    public void add(int pos, int data) {
        try{
            checkPos(pos);

            if(isFull()){
                grow(array);
            }

            for (int i = usedSize - 1; i < pos ; i++) {
                array[i+1] = array[i];
            }
            array[pos] = data;

            this.usedSize++;
        }catch(PosIllegal e){
            System.out.println("pos位置不合法!!");
            e.printStackTrace();
        }
    }

    public void checkPos(int pos) throws PosIllegal{
        if(pos < 0 || pos > usedSize){
            throw new PosIllegal("pos不合法!!");
        }
    }

    public void checkPos1(int pos) throws PosIllegal{
        if(pos < 0 || pos > usedSize){
            throw new PosIllegal("pos不合法!!");
        }
    }
    @Override
    public boolean contains(int toFind) {
        for (int i : array) {
            if (array[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == toFind){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int get(int pos) {
        try{
            checkPos1(pos);
            checkEmpty();
            return array[pos];
        }catch(PosIllegal e){
            System.out.println("pos位置不合法!!");
            e.printStackTrace();
        }catch(EmptyException e){
            System.out.println("顺序表为空!!");
            e.printStackTrace();
        }
        return -1;
    }

    public void checkEmpty() throws EmptyException{
        if(this.usedSize == 0){
            throw new EmptyException("顺序表为空!!");
        }
    }

    @Override
    public void set(int pos, int value) {
        this.array[pos] = value;
    }

    @Override
    public void remove(int toRemove) {
        try {
            checkEmpty();
            int pos = indexOf(toRemove);
            if(pos == -1) {
                return;
            }
            for (int i = pos; i < usedSize-1; i++) {
                array[i] = array[i+1];
            }

            array[usedSize-1] = 0;
            usedSize--;
        }catch (EmptyException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int size() {
        return this.usedSize;
    }

    @Override
    public void clear() {
        for (int i = 0; i < usedSize; i++) {
            array[i] = 0;
        }
        usedSize = 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
