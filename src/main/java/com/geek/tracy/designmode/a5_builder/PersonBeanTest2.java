package com.geek.tracy.designmode.a5_builder;

import org.junit.Test;

/**
 * @Author Tracy
 * @Date 2023/11/3
 */
public class PersonBeanTest2 {

    private String name;
    private String sex;
    private int age;
    private int height;

    public PersonBeanTest2() {
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public static class Builder{
        private String name;
        private String sex;
        private int age;
        private int height;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }
        public PersonBeanTest2 build() {
            PersonBeanTest2 bean = new PersonBeanTest2();
            bean.name = this.name;
            bean.sex = this.sex;
            bean.age = this.age;
            bean.height = this.height;
            return bean;
        }
    }

    /**
     * Builder模式将复杂的对象创建过程分解成多个简单的构造步骤，提供自定义序列的构造方法，是创建复杂对象更加优雅、灵活与可管理
     */
    @Test
    public void mainTest() {
        PersonBeanTest2 person = new Builder().name("Jack").sex("male").age(25).height(180).build();
        System.out.println(person);
    }
}
