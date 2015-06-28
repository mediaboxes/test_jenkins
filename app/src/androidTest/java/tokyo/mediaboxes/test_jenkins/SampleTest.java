package tokyo.mediaboxes.test_jenkins;

import junit.framework.TestCase;

/**
 * Created by Mono on 2015/06/28.
 */
public class SampleTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void testIsTest() throws Exception {
        Sample sample = new Sample();
        //ê¨å˜
        assertEquals(sample.isTest(),true);
    }

    public void testIsNotTest() throws Exception {
        Sample sample = new Sample();
        //ê¨å˜
        assertEquals(sample.isNotTest(),false);
    }
}