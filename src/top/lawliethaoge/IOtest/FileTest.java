package top.lawliethaoge.IOtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author hao@lawliet.com
 * @since 2018/5/24 11:04
 */
public class FileTest {
    /**
     * 展示E盘里的所有文件夹
     * @param []
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
        InputStream inputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        inputStream.read(bytes);
        System.out.println(new String(bytes));
        ShowFileName();
    }
}
