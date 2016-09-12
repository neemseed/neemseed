package poc.loader;
import java.util.*;

public class TestLoader {
    public static void getMetaTest() throws Exception {
        List<Class<?>> values = ClassFinder.getAllClass(Constant.CLASS_PATH);
        System.out.println(values);
    }
       
}
