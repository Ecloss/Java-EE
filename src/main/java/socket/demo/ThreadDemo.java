package socket.demo;

class Demo extends Thread{
    private String name;

    public Demo(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run( ) {
        for (int x = 1; x <= 40; x++) {
            System.out.println(Thread.currentThread().getName() + "..." + name + "..." + x);
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo("张三");
        Demo d2 = new Demo("李四");
        d1.start();
        d2.start();

        for (int x = 1;x < 40; x++) {
            System.out.println(Thread.currentThread().getName() + "..." + x);
        }
    }
}
