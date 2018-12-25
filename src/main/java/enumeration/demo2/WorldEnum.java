package enumeration.demo2;

/**
 * 世界枚举
 *
 * @author 余修文
 * @date 2018/12/10 11:14
 */
public enum  WorldEnum implements ContentEnum {

    SEA("海洋", 1),
    PEOPLE("人类", 2),
    FOOD("食物",3);

    private String content;
    private Integer value;

    private WorldEnum(String content, Integer value) {
        this.content = content;
        this.value = value;
    }

    public static WorldEnum getByValue(Integer value) {
        WorldEnum[] enums = WorldEnum.values();
        for (WorldEnum worldEnum : enums) {
            if (worldEnum.getValue().equals(value)) {
                return worldEnum;
            }
        }
        return null;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }
}
