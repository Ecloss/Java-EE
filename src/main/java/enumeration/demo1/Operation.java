package enumeration.demo1;

public enum Operation {


    //用于执行加法运算
    PLUS {
        @Override
        public double calulate(double x, double y) {
            return x + y;
        }
    },

    //用于执行减法运算
    MINUS {
        @Override
        public double calulate(double x, double y) {
            return x - y;
        }
    },

    //用于执行乘法运算
    TIMES {
        @Override
        public double calulate(double x, double y) {
            return x * y;
        }
    },

    //用于执行除法运算
    DIVIDE {
        @Override
        public double calulate(double x, double y) {
            return x / y;
        }
    };

    /**
     * 为枚举类定义一个抽象方法，枚举类中所有的枚举值都必须实现这个方法
     *
     * @param x
     * @param y
     * @return
     */
    public abstract double calulate(double x, double y);


}
