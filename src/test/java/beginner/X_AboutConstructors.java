package beginner;

import org.junit.Test;

import static constant.Constants.__;
import static org.junit.Assert.assertEquals;

public class X_AboutConstructors {

    class A {
        String someString = "xxx";

        public A() {
            someString = someString + "A";
        }
    }

    class B extends A {
        public B() {
            someString = someString + "B";
        }
    }

    @Test
    public void simpleConstructorOrder() {
        assertEquals(new B().someString, "xxxAB");
    }

}
