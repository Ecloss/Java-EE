package file;

import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * 复习File
 *
 * @author 余修文
 * @date 2018/12/25 10:04
 */
public class TestFileReview07 {

    /**
     * File 的方法
     * new File(Pathname);
     * exists() : 文件存在
     * delete:  删除方法
     * createNewFile:  创建新的文件
     * isFile():  是否是文件
     * isDictiry:  是否是目录
     * mkDir: 创建单极目录
     * mrDirs:  创建多级目录
     * list:  获取目录文件，以String的形式返回
     * listFiles: 获取目录文件，以File的形式返回
     * getParentFile:  获取父目录路径
     * getPath(): 获取目录的文件
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file01\\FileText03.txt");
        if (!file.exists()) {
            System.out.println(file.createNewFile());
        } else {
            System.out.println("文件已经存在：" + file.getPath());
            file.delete();
        }
    }

    @Test
    public void demo01() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file01\\FileText03.txt");
        File file1 = file.getParentFile();
        if (!file1.exists()) {
            file1.mkdir();
        } else {
            if (file1.isDirectory()) {
                System.out.println(file1.getPath() + " 已经存在");
            }
        }
    }

    @Test
    public void demo02() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        Long modifyTime = file.lastModified();
        System.out.println(modifyTime);
        Date date = new Date(modifyTime);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = simpleDateFormat.format(date);
        System.out.println("上一次修改时间是：" + str);
    }

    @Test
    public void dmeo03() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file");
        String[] fileStr = file.list();
        Arrays.asList(fileStr).stream().forEach(str -> System.out.println(str));
    }

    @Test
    public void demo04() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file");
        File[] files = file.listFiles();
        Arrays.asList(files).stream().forEach(file1 -> System.out.println(file1));
    }

    /**
     * 写一个递归调用
     */
    @Test
    public void demo05() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main");
        print(file);
    }

    @Test
    public void demo06() {
        File file = new File("F:\\Workspace\\Java-EE\\Java-EE\\src\\main\\file\\FileText01.txt");
        System.out.println(file.getParentFile().getPath());
    }

    public void print(File file) {
        if (file.isDirectory()) {
            for (File file1 : file.listFiles()) {
                print(file1);
            }
        }
        System.out.println(file);
    }

}
