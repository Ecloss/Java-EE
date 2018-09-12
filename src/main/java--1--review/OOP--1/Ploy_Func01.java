/**
 * 定义USB接口
 *
 * @author 余修文
 * @date 2018/9/12 15:05
 */
interface USB {
    public abstract void open( );
    public abstract void close( );
}

class NoteBook {
    public void run( ) {
        System.out.println("NoteBool run");
    }

    public void useUSB(USB usb) {
        if(usb != null) {
            usb.open();
            usb.close();
        }
    }
}

class MouseByUSB implements USB {
    @Override
    public void open() {
        System.out.println("open mouse");
    }

    @Override
    public void close() {
        System.out.println("close mouse");
    }
}

public class Ploy_Func01 {

    public static void main(String[ ] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.run();
        noteBook.useUSB(null);
        noteBook.useUSB(new MouseByUSB());
    }

}
