###
单例模式：在一个应用程序中，某个类的实例对象只有一个，
你没有办法new，因为构造器被private修饰，一般通过getInstance来获取
常见的单例模式有：饿汉模式，懒汉模式，枚举，静态内部类，双重交验锁


###
观察者模式：对象之间存在一对多的依赖关系，当一个对象的状态发生改变时。
所有依赖它的对象得到消息，并且自动更新


###
装饰者模式：对已有的业务逻辑进一步的封装，使其增加额外的功能。


###
适配器模式：将两种完全不同的事务联系到一起，就像现实生活中的变压器。
假设一个手机充电器需要的电压是20V，但是正常的电压是220V，这时候就需要一个
变压器，将220V的电压转换为20V的电压。


###
工厂模式：一个抽象的接口，多个抽象接口的实现类，一个工厂类，用来实例化抽象的接口。

抽象工厂模式：与工厂方法模式不同的是，工厂方法模式中的工厂只生产单一的产品，而抽象
工厂模式中的工厂生产多个产品。


###
代理模式：即让困难重要的事情，让专业的人来做，自己只要做一些必要（走流程）的事情。