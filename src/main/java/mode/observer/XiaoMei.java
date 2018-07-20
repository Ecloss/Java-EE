package mode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * XiaoMei
 *
 * @author Ecloss
 */
public class XiaoMei {

    List<Person> list = new ArrayList<Person>();

    /**
     * 无参构造器
     */
    public XiaoMei() {
    }

    /**
     * 添加人
     *
     * @param person
     */
    public void addPerson(Person person) {
        list.add(person);
    }

    public void notifyPerson() {
        for (Person person : list) {
            person.getMessage("今天家里就我一个人，你们过来吧，谁先来谁就能得到我！");
        }
    }
}
