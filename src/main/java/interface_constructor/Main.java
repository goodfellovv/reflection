package interface_constructor;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Class<?> cls_1 = ArrayList.class;
        Class<?>[] ifs = cls_1.getInterfaces();

        System.out.println("List of interfaces\n");
        for(Class<?> ifc : ifs) {
            System.out.println (ifc.getName());
        }

        Class<?> cls_2 = ArrayList.class;
        Constructor[] constructors = cls_2.getConstructors();
        for (Constructor constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
    }
}
