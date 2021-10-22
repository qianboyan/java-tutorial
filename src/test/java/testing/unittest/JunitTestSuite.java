package testing.unittest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
    TestJUnit.class,
    TestJUnit2.class,
    TestAnnotation.class
})

public class JunitTestSuite {

}
