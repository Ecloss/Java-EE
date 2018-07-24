###
StringBuffer：代表一个字符序列可变的字符串，当一个StringBuffer被创建以后，通过StringBuffer
提供的append(),insert(),reverse(),setCharAt(),setLentth()等方法就可以改变这个字符串对象的序列。

###
StringBuilder：StringBuilder和StringBuffer基本相似。两个类的构造器和方法也基本相同，
StringBuffer是线程安全的，而StringBuilder是非线程安全的，所以StringBuilder性能略高

###
通常情况下，如果要创建一个内容可变的字符串对象，则应该优先考虑使用StringBuilder类。

###
StringBuilder和String之间最大的区别：StringB的字符序列是可变的。
从程序看到StringBu的length()方法可以返回其字符序列的长度，
而capacity返回值则比length()返回值大