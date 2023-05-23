package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 21:16
 * @Description:
 */
public class Regexp3 {
    public static void main(String[] args) {
        String content = "a11c8aBcABC$";
        // String regStr = "[a-z]";// 匹配a-z任意一个字符
        // String regStr = "[A-Z]";// 匹配A-Z任意一个字符
        // String regStr = "abc";// 匹配 abc 字符串[默认区分大小写]
        // String regStr = "(?i)abc";// 匹配 abc 字符串[不区分大小写]
        // String regStr = "a((?i)b)c";// 匹配
        // String regStr = "[0-9]";// 匹配

        // String regStr = "[^a-z]"; // 匹配 不在a-z之间的任意一个字符
        // String regStr = "[^0-9]"; // 匹配 不在0-9之间的任意一个字符


        String regStr = "[abcd]"; // 匹配 在abcd中的任意一个字符

        Matcher matcher = Pattern.compile(regStr).matcher(content);
        // Matcher matcher = Pattern.compile(regStr, Pattern.CASE_INSENSITIVE).matcher(content); // 不区分大小写
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
