package com.wmr.jdk8.Lambda;

/**
 *日志案例，根据日志级别，显示日志信息
 * 有些场景的代码执行后，结果不一定会被用到，从而造成性能浪费。而Lambda表达式式延迟及执行的，正好可以作为解决方案，提升性能。
 */
public class Demo0Logger {
    public static void log(int level, String msg){
        if(level == 1){
            System.out.println(msg);
        }
    }

    public static void main(String[] args) {
        String msgA = "hello";
        String msgB = "World";
        String msgC = "java";

        log(1, msgA+ msgB + msgC);
        log(2, msgA+ msgB + msgC); //造成性能浪费， 因为日志级别是2,字符串拼接没有意义
    }
}
