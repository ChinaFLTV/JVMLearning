package Day43;

import java.io.*;

/**
 * @author LiGuanda
 * @date 2022/11/11 下午 2:50:44
 * @description no description right now...
 * @filename MyClassLoader.java
 */


public class MyClassLoader extends ClassLoader {


    private String path;


    public MyClassLoader(ClassLoader parent, String path) {

        super(parent);
        this.path = path;

    }


    @Override
    protected Class<?> findClass(String name) {

        String fileName = path + name + ".class";
        try {

            try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
                 ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {

                int len;
                byte[] data = new byte[1024];
                while ((len = inputStream.read(data)) != -1) {

                    outputStream.write(data, 0, len);

                }
                byte[] byteArray = outputStream.toByteArray();
                return defineClass(null, byteArray, 0, byteArray.length);

            }


        } catch (IOException e) {

            throw new RuntimeException(e);

        }

    }


}
