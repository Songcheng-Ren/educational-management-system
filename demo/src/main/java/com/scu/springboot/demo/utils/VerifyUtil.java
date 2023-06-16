package com.scu.springboot.demo.utils;

import java.util.Random;

/**
 * ClassName: verifyUtil
 * Description:
 * date: 2021/8/25 15:35
 *
 * @author 肖鸿亮
 * @since JDK 1.8
 */
public class VerifyUtil {

    public static boolean isNull(Object param){
        if (param == null || "".equals(param)){
            return true;
        }
        return false;
    }

    public static boolean isNotNull(Object param){
        if (param != null && !"".equals(param)){
            return true;
        }
        return false;
    }

    public static boolean isNull(String param){
        if (param == null || "".equals(param)){
            return true;
        }
        return false;
    }

    public static boolean isNotNull(String param){
        if (param != null && !"".equals(param)){
            return true;
        }
        return false;
    }

    public static boolean isNull(Long param){
        if (param == null){
            return true;
        }
        return false;
    }

    public static boolean isNotNull(Long param){
        if (param != null){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] name = {"B18","B2","B3","B4","B5","B6","B7","B8"};
        Random r = new Random();//创建随机数对象
        for (int i = 0; i < name.length; i++) {
            int r1 = r.nextInt(name.length);
            String temp = "";//定义一个中间变量
            temp = name[i];//开始互换元素
            name[i] = name[r1];
            name[r1] = temp;
        }
        for (int i = 0; i < name.length; i++) {//再将排好的序输出
            System.out.println((i + 1) + "、" + name[i]);

        }
    }

}
