###
Lambda表达式与函数式接口
函数式接口代表只包含一个抽象方法的
接口。
函数式接口可以包含多个默认方法，类方法。
但只能声明一个抽象方法。

###
所谓的Lambda表达式，就是不用直接创建
一个新的对象，该而用Lambda表达式来创建

###
@FunctionalInterface注解

###
Lambda表达式实现的是匿名方法——因此它只能实现
特定函数式接口中的唯一方法。这意味着Lambda
表达式有两个限制：
1. Lambda表达式的目标类型必须是明确的函数式接口
2. Lambda表达式只能为函数式接口创建对象。Lambda表达式只能实现
一个方法

###
Lambda表达式就是实现函数式接口的一种方式

###
Lambda表达式：优点是减少了代码的重复性。你需要
这个接口的实现类的时候，就写一个Lambda表达式，不用再创建一个类
实现这个接口。