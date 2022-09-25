package Day10;

/*
 * @author LiGuanda
 * @date  AM 10:13:42
 * @description This is a description of DirectMemoryTest
 ** @params
 ** @return
 ** @since version-1.0  */


import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * @author Lenovo
 */
public class DirectMemoryTest {


    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocateDirect(1024 * 1024 * 1024);
        System.out.println("Allocate direct memory completely!");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Start to release direct memory!");
        System.gc();
        scanner.nextLine();

    }


}
