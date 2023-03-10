import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MyArrayListTest {

    List<Object> list = new MyArrayList<>();

    @Test
    public void addElementToMyArrayList() {
        Assert.assertTrue(list.add("Hello"));
        Assert.assertThrows(NullPointerException.class,
                () -> list.add(null));
    }
    @Test
    public void getStringFromMyArrayList() {
        list.add("Hello Pavel");
        Assert.assertEquals("Hello Pavel", list.get(0));
    }

    @Test
    public void sizeTenOfMyArrayList() {
        list.add("Hello");
        list.add("World");
        Assert.assertEquals(2, list.size());
    }

    @Test
    public void shouldReturnTrueIfEmpty() {
        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void shouldReturnTrueIfListContainsTheElement() {
        list.add("Element");
        Assert.assertTrue(list.contains("Element"));
    }


}