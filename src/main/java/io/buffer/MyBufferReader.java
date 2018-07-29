package io.buffer;

import java.io.IOException;
import java.io.Reader;

public class MyBufferReader extends Reader {
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    /**
     * 模拟一个BufferedReader的高效单字符输入方法read()
     */

    private Reader r;

    //
    public MyBufferReader(Reader r) {
        this.r = r;
    }

    //
    private char[] buffer = new char[1024];

    //
    private int index = 0;

    //
    private int count = 0;

    public int myRead() throws IOException {

        //  通过被缓冲流对象的read方法，就可以将设备上的数据存储到数组中
        if (count == 0) {
            count = r.read(buffer);
            index = 0;
        }
        if (count < 0) {
            return -1;
        }
        char ch = buffer[index];
        //  下标每读一次都要自增
        index++;
        //  既然取出一个，数组的数量要减少
        count--;

        return ch;
    }

    /**
     * 读取一行文本
     *
     * @throws IOException
     */
    public String myReadLine() throws IOException {

        //  1. 定义临时缓冲区，用于存储一行文本
        StringBuilder sb = new StringBuilder();

        //  2. 不断调用myRead方法从缓冲区中取出数据
        int ch = 0;
        while ((ch = myRead()) != -1) {

            //  在存储前，要判断行终止符号
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return sb.toString();
            }

            //  对读到的字符进行临时存储
            sb.append((char) ch);
        }

        //  如果文本结尾有数据，但没有行结束符。数据已被读到。并存储到StringBuilder中
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }

    /**
     * 定义一个缓冲区的关闭方法
     * @throws IOException
     */
    public void myClose() throws IOException {
        //  其实就是在关闭缓冲区的流对象
        r.close();
    }

}
