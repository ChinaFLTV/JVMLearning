package Day6;

/*
 ** @author LiGuanda
 ** @date  AM 8:49:34
 ** @description This is a description of EscapeTest
 ** @params
 ** @return
 ** @since version-1.0  */


public class EscapeTest {


    public static void main(String[] args) {


        long time = 0;
        for (int i = 0; i < 10000000; i++) {

            long start = System.currentTimeMillis();
            createUser();
            long end = System.currentTimeMillis();
            time += end - start;

        }

        System.out.println("Consuming Time : " + time + " ms");
        try {

            Thread.sleep(100000000);

        } catch (InterruptedException e) {

            throw new RuntimeException(e);

        }


    }


    public static void createUser() {

        User user = new User();

    }


}
