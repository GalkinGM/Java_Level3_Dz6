import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class DigitalCutoffTest {
    Digital test1;

    @Before
    public void befor(){
        test1 = new DigitalCutoff();
    }

    @Test
    public void digitalCutoff (){
//        Digital test1 =new DigitalCutoff();
        int [] arr = new int[] {1, 2, 4, 4, 2, 3, 4, 2, 1, 7};
        int x = 4;
        assertArrayEquals(new int[]{2, 1, 7}, test1.digitalCutoff(arr,x));
    }

    @Test
    public void digitalCutoff2 (){
//        Digital test1 =new DigitalCutoff();
        int [] arr = new int[] {1, 2, 4, 4};
        int x = 4;
        assertArrayEquals(new int[]{}, test1.digitalCutoff(arr,x));
    }

    @Test
    public void digitalCutoff3 () {
//        Digital test1 =new DigitalCutoff();
        int [] arr = new int[] {4, 4, 2, 3, 4, 1, 7, 5, 1};
        int x = 4;
        assertArrayEquals(new int[]{ 1, 7, 5, 1}, test1.digitalCutoff(arr,x));
    }

    @Test(expected = RuntimeException.class)
    public void digitalCutoff4 () {
//        Digital test1 =new DigitalCutoff();
        int [] arr = new int[] { 1, 7, 5, 1};
        int x = 4;
        assertArrayEquals(new int[]{ 1, 7, 5, 1}, test1.digitalCutoff(arr,x));
    }


}
