package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/18 20:27
 * @Description:
 */
public class Regexp {
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
        // 提取文章中所有的英文单词
        // 1. 传统该方法：使用遍历方式，代码量大，效率不高
        // 2. 正则表达式技术

        // 1. 先创建一个Pattern对象，模式对象，可以理解成就是一个正则表达式对象
        // Pattern pattern = Pattern.compile("[a-zA-Z]+");// 所有英文单词
        // Pattern pattern = Pattern.compile("[0-9]+");// 所有数字
        Pattern pattern = Pattern.compile("([a-zA-Z]+)|([0-9]+)");// 所有英文单词和数字

        // 2. 创建一个匹配器对象
        // 理解：就是matcher匹配安装pattern（模式/样式），到Content文本中去匹配
        Matcher matcher = pattern.matcher(content);
        // 3. 可以开始循环匹配
        while (matcher.find()) {
            // 匹配内容，文本，放到m.group(0)中
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
