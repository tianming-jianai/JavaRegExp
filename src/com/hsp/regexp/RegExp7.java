package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 22:23
 * @Description: 分组
 */
public class RegExp7 {
    public static void main(String[] args) {
        String content = "hanshunping s7789 nn1189han";
        // 匹配4个数字
        // String regStr = "(\\d\\d)(\\d)(\\d)";
        // 命名分组
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d)(?<g3>\\d)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
            System.out.println("找到g1：" + matcher.group("g1"));
            System.out.println("找到g2：" + matcher.group("g2"));
            System.out.println("找到g3：" + matcher.group("g3"));
        }
    }
}
