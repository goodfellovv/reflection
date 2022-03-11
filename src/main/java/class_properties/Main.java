package class_properties;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class myClass_ref = Class.forName("MyClass");

        int mods = myClass_ref.getModifiers();
        if (Modifier.isPublic  (mods))	{ System.out.println("public");  }
        if (Modifier.isAbstract(mods))	{ System.out.println("abstract");}
        if (Modifier.isFinal   (mods))	{ System.out.println("final");   }

        Class superClazz = myClass_ref.getSuperclass();
    }
}
