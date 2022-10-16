package Day20;

/*
 ** @author LiGuanda
 ** @date  PM 4:24:35
 ** @description This is a description of ReferenceTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author Lenovo
 */
public class ReferenceTest {


    public static void main(String[] args) {

        Object o = new Object();
        SoftReference<Object> softReference = new SoftReference<>(o);
        o = null;
        WeakReference<Object> weakReference = new WeakReference<>(new Object());
        PhantomReference<Object> objectPhantomReference = new PhantomReference<>(new Object(), new ReferenceQueue<>());
        System.out.println(softReference.get());
        System.out.println(weakReference.get());
        System.out.println(objectPhantomReference.get());
        System.gc();



    }


}
