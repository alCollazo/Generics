package collazo.albert;

import java.util.Arrays;

public class MyArrayList<E>{
    private int arraySize;
    private E[] array;

    public MyArrayList() {
        this(5);
        arraySize = 0;
    }

    public MyArrayList(int arraySize) {
        array = (E[])new Object[arraySize];
        this.arraySize = arraySize;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void resizeArray(int index){
        if(array.length < index){
            array = Arrays.copyOf(array,index+1);
        }
    }

    public void add(int index, E element){
        resizeArray(index);
        if(index > arraySize){
            arraySize = index + 1;
            array[index] = element;
        }else{
            arraySize++;
            E[] newArray = Arrays.copyOfRange(array, 0 , array.length -1);
            array[index] = element;
            for(int i = index; i < newArray.length; i++){
                array[i+1] = newArray[i];
            }
        }
    }

    public E get(int index){
        return array[index];
    }

    public void remove(int index){
        E[] newArray = Arrays.copyOfRange(array, 0, array.length-1);
        for(int i = index; i < newArray.length-1;i++){
            array[i] = newArray[i+1];
        }
        arraySize--;
    }

    public void set(int index, E e){
        resizeArray(index);
        if(index > arraySize){
            arraySize = index+1;
        }
        array[index] = e;
    }

    public void clear(){
        array = (E[]) new Object[5];
        arraySize = 0;
    }

    public boolean isEmpty(){
        if(arraySize == 0) {
            return true;
        }
        return false;
    }

    public boolean contains(Object o){
        for(int i = 0; i < arraySize; i++){
            if(o.equals(array[i])){
                return true;
            }
        }
        return false;
    }

}
