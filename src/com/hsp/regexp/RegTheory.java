package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/18 20:53
 * @Description:
 */
public class RegTheory {
    public static void main(String[] args) {
        String content = "12岁时，他已能设计电子游戏机，帮忙邻居修理收割机。大学时期在天文系担任程式开发工读生，\n" +
                "\n" +
                "1977年获得加拿大卡尔加里大学计算机科学学士学位。\n" +
                "\n" +
                "1981年开发在Unix上运行的Emacs类编辑器Gosling Emacs（以C语言编写，使用Mocklisp作为扩展语言）。\n" +
                "\n" +
                "1983年获得了美国卡内基梅隆大学计算机科学博士学位，博士论文的题目是：\"The Algebraic Manipulation of Constraints\"。毕业后到IBM工作，设计IBM第一代工作站NeWS系统，但不受重视。后来转至Sun公司。\n" +
                "\n" +
                "1990年，与Patrick Naughton和Mike Sheridan等人合作“绿色计划”，后来发展一套语言叫做“Oak”，后改名为Java。\n" +
                "\n" +
                "1994年底，James Gosling在硅谷召开的“技术、教育和设计大会”上展示Java程式。";
        // 目标匹配所有四个数字
        // 说明：
        // 1. \\d 表示匹配一个数字
        String regStr = "(\\d\\d)(\\d\\d)";
        // 2. 创建模式对象【即正则表达式对象】
        Pattern pattern = Pattern.compile(regStr);
        // 3. 创建匹配器（按照正则表达式的规则去匹配content字符串）
        Matcher matcher = pattern.matcher(content);
        // 4. 开始匹配
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
            System.out.println("第一组匹配到的值：" + matcher.group(1));
            System.out.println("第一组匹配到的值：" + matcher.group(2));
        }
        /**
         * matcher.find() 完成的任务
         * 1. 根据指定的规则，定位满足规则的子字符串（比如1998）
         * 2. 找到后，将子字符串的开始的索引记录到matcher对象的属性 int[] groups
         *      groups[0] = 0 , 把该子字符串的结束的索引+1的值记录到groups[1] = 4
         * 3. 同时记录oldLast的值为子字符串结束的索引+1的值，即4，即下次执行find时，就从4开始匹配
         *
         * matcher.group(0)
         * 1. 根据 group[0] 和 group[1] 的记录的位置， 从content开始截取子字符串返回 就是 [0, 4)
         *      如果再次指向find方法，仍然按照上面分析来执行
         *
         * 1，根据指定的规则，定位满足规则的子字符串(比如(19)(98))
         * 2．找到后，将子字符串的开始的索引记录到 matcher对象的属性 int[] groups;
         *      2.1 groups[0] = 0，把该子字符串的结束的索引+1的值记录到 groups[1] = 4
         *      2.2记录1组()匹配到的字符串groups[2] = 0groups[3] = 2
         *      2.3记录2组()匹配到的字符串 groups[4] = 2 groups[5] =4
         *      2.4.如果有更多的分组.....
         */
    }

}
