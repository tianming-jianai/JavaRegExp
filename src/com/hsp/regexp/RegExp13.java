package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 20:54
 * @Description:
 * 经典的结巴程序：
 * 把类似：“我...我要...学学学学...编程java”
 * 通过正则表达式 修改成 我要学编程java
 */
public class RegExp13 {

    public static void main(String[] args) {
        String content = "我...我要...学学学学...编程java";
        String regStr = "(.)\\1+";
        // 1. 去掉所有.
        content = Pattern.compile("\\.").matcher(content).replaceAll("");
        System.out.println("content："+content);
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        // 2. 去掉重复的字
        // 思路
        // (1) (.)\\1+
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
        // (2)使用反向引用$1 来替换匹配到的内容
        // content = matcher.replaceAll("$1");
        // System.out.println("----------------");
        // System.out.println(content);

        // 3. 使用一条语句去掉重复的字
        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);
    }
}
