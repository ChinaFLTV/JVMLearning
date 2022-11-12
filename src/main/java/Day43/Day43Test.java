package Day43;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author LiGuanda
 * @date 2022/11/11 下午 2:55:04
 * @description no description right now...
 * @filename Day43Test.java
 */


public class Day43Test {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        MyClassLoader classLoader = new MyClassLoader(null, "D:/");
        Class<?> father = null;
        try {

            father = classLoader.loadClass("Father");

        } catch (ClassNotFoundException e) {

            System.err.println("未找到类");

        }
        System.out.println("Father : " + father.getClassLoader().getName());
        Constructor<?> constructor = father.getConstructor();
        Object instance = constructor.newInstance();
        Method check = father.getDeclaredMethod("check");
        check.invoke(instance);
        //System.out.println(father.getClassLoader().getParent().getName());

    }


}
