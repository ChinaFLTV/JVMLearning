package Day11;

/*
** @author LiGuanda
** @date  AM 8:51:14
** @description This is a description of JITTest
** @params
** @return
** @since version-1.0  */


import java.util.ArrayList;

/**
 * @author Lenovo
 */
public class JITTest {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        for(int i = 0;i<99999;i++){


            arrayList.add(Integer.toString(i)+"abcdefg");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }


}
