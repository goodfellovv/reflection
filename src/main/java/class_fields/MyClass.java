package class_fields;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MyClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<?> cls_1 = ArrayList.class;
        Field[] fields = cls_1.getFields();
        for (Field field_1 : fields) {
            System.out.println("Class name : " + field_1.getName());
            System.out.println("Class type : " + field_1.getType().getName());
        }

        Class<?> cls_2 = ArrayList.class;
        Field field_2 = cls_2.getDeclaredField("serialVersionUID");
        //Field field_2 = cls_2.getField("serialVersionUID"); - Private field
        System.out.println("Class name : " + field_2.getName());
        System.out.println("Class type : " + field_2.getType().getName());

        Class<?> cls_3 = ArrayList.class;
        Field field_3 = cls_3.getDeclaredField("serialVersionUID"); // - Private field
        field_3.setAccessible(true); // - Private field
        long value = (long) field_3.get(ArrayList.class);
        field_3.set(value, 123123123);
    }
}
