
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * MainTester
 *
 * @author <Authors name>
 * @since <pre>Mar 10, 2017</pre>
 * @version 1.0
 */
@RunWith(Parameterized.class)

public class MainTestPara {


    private int a;
    private int b;
    private int c;
    private String expected;
    private Main proc = null;

    public MainTestPara(int a,int b,int c,String expected){
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected = expected;
    }

    @Before
    public void before() throws Exception {
        System.out.println("Before Testing");
        proc = new Main();
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getData(){
        return Arrays.asList(new Object[][]{
                {1,1,2,"NotATriangle"},
                {1,1,1,"equilateral"},
                {1,2,2,"isosceles"},
                {2,3,4,"scalene"}
        });
    }
    /**
     *
     * Method: judgeTriangleType(int a, int b, int c)
     *
     */
    @Test
    public void testJudgeTriangleType() throws Exception{
        assertEquals(this.expected,proc.judgeTriangleType(a,b,c));
    }

}
