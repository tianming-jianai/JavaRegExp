package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 19:54
 * @Description: Matcher常用方法
 */
public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jack tom hello smith hello";
        String regStr = "hello";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("=====");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group(0));
            System.out.println(content.substring(matcher.start(), matcher.end()));
        }

        // 整体匹配，常用语某个字符串是否满足某个规则
        System.out.println(Pattern.compile("[\\w|\\s]+").matcher(content).matches());

        // replaceAll
        String res = matcher.replaceAll("^^^");
        System.out.println(res);
    }
}
