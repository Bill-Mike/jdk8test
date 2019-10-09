package com.wmr.jdk8;

public class Demo {
    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFunctionalInterfaceImpl());

        //调用show方法，方法的参数是一个接口的匿名内部类
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类");
            }

        });

        //调用show方法，方法的参数是一个参数是接口，所以我们可以使用lambda表达式
        show(() ->{
            System.out.println("使用Lambda表达式");
        });

        //简化Lambda表达式
        show(() -> System.out.println("使用Lambda表达式"));
    }
}
