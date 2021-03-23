import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class MassDigitalCutoffTest {
    int [] x;
    int [] y;
    int    z;
    static Digital test;

    @BeforeClass
    public static void inity (){
        test = new DigitalCutoff();
    }

    public MassDigitalCutoffTest(int[] x, int[] y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        List<Object[]> objects = Arrays.asList(new Object[][]{
                {new int[]{2, 1, 7}, new int[]{1, 2, 4, 4, 2, 3, 4, 2, 1, 7}, 4},
                {new int[]{1, 7, 5, 1}, new int[]{2, 4, 4, 2, 3, 4, 1, 7, 5, 1}, 4}

        }); return objects;
    }
    @Test
    public void digitalCutoff (){
        assertArrayEquals(x, test.digitalCutoff(y,z));
    }
//    {1, 2, 4, 4, 2, 3, 4, 2, 1, 7};
}
