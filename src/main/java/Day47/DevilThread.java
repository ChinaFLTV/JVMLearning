package Day47;

/**
 * @author LiGuanda
 * @date 2022/11/19 上午 8:21:12
 * @description no description right now...
 * @filename DevilThread.java
 */


public class DevilThread {


    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 10000; i++) {


            String str = new String("IU loves Dage!");
            Wife wife = new Wife("JuJingyi" + i, 27);

        }

        Thread.sleep(1000 * 60 * 60 * 60);

    }


}

class Wife {


    private String name;
    private int age;


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public Wife(String name, int age) {

        this.name = name;
        this.age = age;

    }


    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    @Override
    public String toString() {

        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }


}