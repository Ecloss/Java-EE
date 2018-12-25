package io.buffer;

import java.io.*;

/**
 * BufferReader
 *
 * @author Ecloss
 */
public class BufferReaderDemo01 {

    public static void main(String[] args) {

        FileReader dir = null;
        BufferedReader bufr = null;
        try {
            dir = new FileReader("F:\\Workspace\\file\\002.txt");
            bufr = new BufferedReader(dir);
            String str = "";
            StringBuilder sb = new StringBuilder("");
            while ((str = bufr.readLine()) != null) {
                System.out.println(str);
                sb.append(str);
            }
            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dir != null || bufr != null) {
                try {
                    dir.close();
                    bufr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
