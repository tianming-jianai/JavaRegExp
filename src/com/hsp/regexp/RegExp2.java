package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 20:53
 * @Description:
 */
public class RegExp2 {
    public static void main(String[] args) {
        String content = "1111abc$.(abc(123(";
        // 匹配( => \\(
        // 匹配. => \\.
        String regStr = "\\d{3,4}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
