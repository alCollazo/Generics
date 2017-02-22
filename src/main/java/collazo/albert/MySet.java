package collazo.albert;

import org.hamcrest.internal.ArrayIterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class MySet<E>{

    private E[] array;

    public MySet() {
        array = (E[]) new Object[0];
    }

    public boolean add(E obj){
        if(!contains(obj)){
            array = Arrays.copyOf(array, array.length+1);
            array[array.length-1] = obj;
            return true;
        }
        return false;
    }

    public void clear(){
        array = (E[]) new Object[0];
    }

    public boolean contains(E obj){
        for(int i = 0; i < array.length; i++){
        if(obj.equals(array[i])){
            return true;
        }
    }
        return false;
    }

    public Object[] toArray(){
        return array;
    }

    public boolean remove(E obj){
        for(int i = 0; i < array.length; i++){
            if(obj.equals(array[i])){
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty(){
        if(array.length == 0) {
            return true;
        }
        return false;
    }

    public int size(){
        return array.length;
    }

    public Iterator<E> iterator(){
        Iterator<E> iterator = (Iterator<E>) new ArrayIterator(array);
        return iterator;
    }

}
