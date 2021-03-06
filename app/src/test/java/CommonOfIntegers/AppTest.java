/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package CommonOfIntegers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    public void testValid(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(11, 25, 60, 91));
        assertEquals(60, App.getCommon(array, 3, 4, 5));
    }
    public void testInvalid(){
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(11, 25, 70, 91));
        assertNotEquals(60, App.getCommon(array, 3, 4, 5));
    }
    public void testEmptyArray(){
        ArrayList<Integer> array = new ArrayList<>();
        assertNotEquals(60, App.getCommon(array, 3, 4, 5));
    }
    public void testNullArray(){
        assertNotEquals(60, App.getCommon(null, 3, 4, 5));
    }
}
