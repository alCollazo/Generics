package collazo.albert;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MySetTest {

    MySet<String> mySet;

    @Before
    public void setup(){
        mySet = new MySet<>();
        mySet.add("Bert");
    }

    @Test
    public void addTest(){
        mySet.add("Al");
        assertTrue(mySet.contains("Al"));
    }


    @Test
    public void containsTest(){
        Boolean expected = true;
        Boolean actual = mySet.contains("Bert");
        assertEquals(expected,actual);
    }

    @Test
    public void removeTest(){
        Boolean expected = true;
        Boolean actual = mySet.remove("Bert");
        assertEquals(expected, actual);
    }

    @Test
    public void sizeTest(){
        Integer expected = 1;
        Integer actual = mySet.size();
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        mySet.clear();
        int expected  = 0;
        int actual = mySet.size();
        assertEquals(expected, actual);
    }

    @Test
    public void iteratorTest(){
        Iterator<String> iterator= mySet.iterator();
        String actual = "";
        while(iterator.hasNext()){
            actual = iterator.next();
        }
        String expected = "Bert";
        assertEquals(actual, expected);
    }
    @Test
    public void toArrayTest(){
        mySet.add("Al");
        Object[] expected = {"Bert", "Al"};
        Object[] actual = mySet.toArray();
        assertEquals(expected, actual);
    }


}
