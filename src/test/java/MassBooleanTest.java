import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MassBooleanTest {
    boolean x;
    int [] arr;
    static BooleanCompare test;

    @BeforeClass
    public static void inity (){
        test = new BooleanCompare();
    }


    public MassBooleanTest(boolean x, int[] arr) {
        this.x = x;
        this.arr = arr;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<Object[]> objects = Arrays.asList(new Object[][]{
                {true, new int[] {1, 1, 1, 4, 4, 1, 4, 4 } },
                {false, new int[]{1, 1, 1, 1, 1, 1} },
                {false, new int[]{4, 4, 4, 4}},
                {false, new int[]{1, 4, 4, 1, 3,1, 4} }

        }); return objects;
    }
    @Test
    public void massBoolean (){
        assertEquals(x , test.blNumArr(arr));
    }


//    {1, 2, 4, 4, 2, 3, 4, 2, 1, 7};
}
