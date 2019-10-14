package com.wmr.jdk8.Lambda;

/**
 * 使用Lambda优化日志案例
 * Lambda特点：延迟加载
 * Lambda适用前提：必须使用函数式接口
 */
public class DemoLambda {
    //定义一个显示日志的方法
    public static void log(int level, MessageBuilder messageBuilder){
        if(level == 1){
            System.out.println(messageBuilder.buliderMessage());
        }
    }

    public static void main(String[] args) {

        String msgA = "hello";
        String msgB = "World";
        String msgC = "java";
        /*
        使用Lambda表达式传递参数仅仅是把参数传递到log方法中，只用满足条件时messageBulider的字符串才会拼接，不满足是不会执行，所以性能比直接将拼接字符串当参数传递时会提升一点性能
         */
        log(1, () ->{
            //返回拼接好的字符串
            return msgA + msgB + msgC;
        });
    }
}
