package Day16;

/*
 ** @author LiGuanda
 ** @date  AM 11:11:55
 ** @description This is a description of FinalizationTest
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class FinalizationTest {


    public static FinalizationTest obj;

    public static void main(String[] args) throws InterruptedException {

        obj = new FinalizationTest();
        obj = null;
        System.gc();
        Thread.sleep(2000);
        if (obj == null) {

            System.out.println("First:dead~~");

        } else {

            System.out.println("First:alive~~");

        }

        obj = null;
        System.gc();

        if (obj == null) {

            System.out.println("Second:dead~~");

        } else {

            System.out.println("Second:alive~~");

        }

    }


    @SuppressWarnings("deprecation")
    @Override
    protected void finalize() throws Throwable {

        super.finalize();
        System.out.println("Invoke finalize() method");
        obj = this;

    }


}
