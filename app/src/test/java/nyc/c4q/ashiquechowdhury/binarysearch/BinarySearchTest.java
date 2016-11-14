package nyc.c4q.ashiquechowdhury.binarysearch;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ashiquechowdhury on 11/13/16.
 */
public class BinarySearchTest {
    int array[] = {1, 4, 6, 7, 9, 12, 16, 17, 18, 92};

    @Test
    public void noNumber91() throws Exception{
        int answer = MainActivity.binarySearch(0, array.length-1, array, 91);
        assertEquals(answer, -1);
    }

    @Test
    public void indexOf92() throws Exception{
        int answer = MainActivity.binarySearch(0, array.length-1, array, 92);
        assertEquals(answer, 9);
    }

    @Test
    public void indexOf1() throws Exception{
        int answer = MainActivity.binarySearch(0, array.length-1, array, 1);
        assertEquals(answer, 0);
    }

    @Test
    public void indexOf9() throws Exception{
        int answer = MainActivity.binarySearch(0, array.length-1, array, 9);
        assertEquals(answer, 4);
    }
}
