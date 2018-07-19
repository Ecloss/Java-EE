package socket.socketException;

/**
 * 执行锁异常
 *
 * @author Ecloss
 */
public class ThreadExceptionDemo  {

    public static void main(String[] args) throws Exception {
        new Thread(new Demo()).start();
        Thread.sleep(10);
        int[] arr = new int[3];
        int arr1[] = new int[3];
        System.out.println(arr[2]);
        System.out.println("over");
    }

}
