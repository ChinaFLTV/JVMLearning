package Day6;

/*
** @author LiGuanda
** @date  AM 8:50:56
** @description This is a description of User
** @params
** @return
** @since version-1.0  */



/**
 * @author Lenovo
 */
public class User {


    private String name;
    private int age;


    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    @Override
    public String toString() {

        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';

    }


}
