package top.lawliethaoge.IOtest;

import java.io.*;

/**
 * @author hao@lawliet.com
 * @since 2018/5/24 11:04
 */
public class FileTest {
    /**
     * 展示E盘里的所有文件夹
     * @return void
     */
    public static void ShowFileName(){
        File file = new File("E:\\");
        File[] files = file.listFiles();
        for(File file1 : files){
            System.out.println(file1.getName());
        }



    }
    public static void main(String[] args) throws Exception {
        File file = new File("E:\\haha.txt");

        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write("写入成功".getBytes());
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        ShowFileName();
    }
}
