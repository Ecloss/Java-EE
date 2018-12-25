package enumeration.demo2;

/**
 * 实现公司用到的枚举实例
 *
 * @author 余修文
 * @date 2018/12/10 10:52
 */
public interface ContentEnum {

    /**
     * 获取枚举内容
     */
    String getContent();

    /**
     * 获取枚举
     */
    Integer getValue();

    /**
     * 判断是否相等
     * 默认方法
     */
    default boolean equalValue(Integer value) {
        return value != null && value.equals(this.getValue());
    }

}
