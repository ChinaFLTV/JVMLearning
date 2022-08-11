package Day2;

/*
 *
 *  6
 * @return
 * @author Dage
 * @creed:超越自己，琳琅天上
 * @date 2022/8/9 PM 1:33:31
 */

import java.security.Provider;

/**
 * @author Lenovo
 */
@SuppressWarnings("unused")
public class HelloWorld {


    public static int i = 666;

    public void helloWorld() {

        i = 88;

    }


    public static void main(String[] args) {

        System.out.println("Hello world!");
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);
        ClassLoader bootClassLoader = extClassLoader.getParent();
        System.out.println(bootClassLoader);
        ClassLoader defineClassLoader = HelloWorld.class.getClassLoader();
        System.out.println(defineClassLoader);
        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println(stringClassLoader);
        ClassLoader providerClassLoader = Provider.class.getClassLoader();
        System.out.println(providerClassLoader);
        ClassLoader threadClassLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(threadClassLoader);
        System.out.println("-------------------------fragment segment line------------------------");
/*
        String extDirs = System.getProperty("java.ext.dirs");
        for (String s : extDirs.split(";")) {

            System.out.println(s);

        }
*/

    }


}
