###
IO流的基础

FileInputStream: 从文件系统中的某个文件中获得输入字节。
FilterInputStream：可以直接传输数据或提供一些额外的功能
    BufferedInputSteam：该类实现缓冲的输入流
    DataInputSteamSteam：操作基本数据类型的流
ObjectInputStream：对象的序列化
PipedInputStream：管道输出流是管道的发送端
SequenceInputStream：序列流
ByteArrayInputStream：操作内存数组，关闭动作无效

OutputStream：此抽象类是表示输出字节流的所有类的超类
FileOutputStream：文件输出流是用于将数据写入File或FIleDescriptor的输出流
FilterOutputStream：此类是过滤输出流的所有类的超类


1.输出流所关联的目的地，如果不存在，会自动创建。如果存在，则替换并覆盖。(这与File对象，如果存在、创建失败有所区别)

2.底层流资源使用完以后一定要记得释放资源。也即IO一定要写finally。

3.一定要在释放资源前先判断输出流对象是否为空。因为try中创建输出流对象失败，则fos依然是null，但是空指针没法调用close()函数释放资源，这回导致抛出NullPointerException异常。