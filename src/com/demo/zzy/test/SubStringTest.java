package com.demo.zzy.test;

/**
 * @Author: 张忠源
 * @Description: TODO
 * @DateTime: 2022/3/11 10:10
 **/
public class SubStringTest {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz";

        //substring,前闭后合，返回截取后的字符串
        System.out.println(str.substring(1, 3));

        //replace 返回替代后的新字符串
        String str2 = "1 2 3 ";
        System.out.println(str2.replace(" ", ""));
    }
}
