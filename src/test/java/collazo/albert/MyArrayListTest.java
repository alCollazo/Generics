package collazo.albert;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyArrayListTest {

    MyArrayList<String> myArrayList;

    @Before
    public void setup(){
        myArrayList = new MyArrayList<>();
        myArrayList.add(1,"Bert");
    }

   /* @Test
    public void addTest1(){
        myArrayList.add("Bert");
        Integer expected = 2;
        Integer actual = myArrayList.
    }*/

    @Test
    public void addTest2(){
        String expected = "Bert";
        String actual = myArrayList.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        String expected = "Bert";
        String actual = myArrayList.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        myArrayList.remove(1);
        String expected = null;
        String actual = myArrayList.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void removeTest2(){
        myArrayList.remove(1);
        int expected = 1;
        int actual = myArrayList.getArraySize();
        assertEquals(expected,actual);
    }

    @Test
    public void setTest(){
        myArrayList.set(1, "Al");
        String expected = "Al";
        String actual = myArrayList.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void isEmptyTest(){
        myArrayList.clear();
        int expected  = 0;
        int actual = myArrayList.getArraySize();
        assertEquals(expected, actual);
    }

    @Test
    public void containsTest(){
        assertTrue(myArrayList.contains("Bert"));
        assertFalse(myArrayList.contains("Al"));
    }
}
