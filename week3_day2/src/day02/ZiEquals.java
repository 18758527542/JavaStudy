package day02;

import java.util.Objects;

public class ZiEquals {
    private int age = 15;
    private String name = "张三";

    ZiEquals(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        //如果地址都一样，那直接就返回true
        if (this == o) return true;
        //如果参数是空的，并且车辆的类型信息一致，则认为是不用的
        if (o == null || getClass() != o.getClass()) return false;
        //强制类型转换成子类
        ZiEquals ziEquals = (ZiEquals) o;
        // 要求基本类型相等，并且将引⽤类型交给java.util.Objects类的equals静态⽅法取⽤结果
        return age == ziEquals.age &&
                name.equals(ziEquals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
