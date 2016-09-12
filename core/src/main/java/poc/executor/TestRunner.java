package poc.executor;
import poc.loader.*;

public class TestRunner {
    public static void main(String[] args) throws Exception {
        Thread.sleep(10000);
        long start = System.currentTimeMillis();
        runTest();
        System.out.println(((System.currentTimeMillis() - start) / 1000)+" seconds");
        Thread.sleep(10000);

    }

    private static void runTest() throws Exception {
        TestLoader.getMetaTest();
    }
}
