package methods;

import class_fields.MyClass;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls_1 = ArrayList.class;
        Method[] methods = cls_1.getMethods();
        for (Method method : methods) {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " + method.getReturnType().getName());
            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (Class<?> paramType : params) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        Class<?> cls_2 = ArrayList.class;
        Class[] params = new Class[] {Object.class};
        Method method = cls_2.getMethod("contains", params);
        method.invoke(new ArrayList<String>(), new MyClass());
    }
}
