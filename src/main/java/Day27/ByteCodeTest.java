package Day27;

/*
 ** @author LiGuanda
 ** @date  AM 7:32:15
 ** @description This is a description of ByteCodeTest
 ** @params
 ** @return
 ** @since version-1.0  */


/**
 * @author Lenovo
 */
public class ByteCodeTest {


    public static void main(String[] args) {

/*        Integer x = 5;
        int y = 5;
        System.out.println(x == y);*/
/*        String str1 = new String("Hello") + new String("World");
        String str2 = "HelloWorld";
        System.out.println(str1 == str2);*/
        Father father = new Son();


    }


}

class Father {


    public int age = 40;


    public Father() {

        check();
        age = 45;

    }


    public void check() {

        System.out.println("The age of father is " + age);

    }


}

class Son extends Father {


    public int age = 20;


    public Son() {

        check();
        age = 21;

    }


    @Override
    public void check() {

        System.out.println("The age of son is " + age);

    }


}
