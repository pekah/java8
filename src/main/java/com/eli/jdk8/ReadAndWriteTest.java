package com.eli.jdk8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by pekah on 2017/7/25.
 */
public class ReadAndWriteTest {

    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("test_read.txt");
        FileChannel fileInChannel = fileInputStream.getChannel();

        FileOutputStream fileOutputStream = new FileOutputStream("test_write.txt");
        FileChannel fileOutChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(512);

        while (true){
            byteBuffer.clear();

            int read = fileInChannel.read(byteBuffer);

            if(-1 == read){
                break;
            }

            byteBuffer.flip();

            fileOutChannel.write(byteBuffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
