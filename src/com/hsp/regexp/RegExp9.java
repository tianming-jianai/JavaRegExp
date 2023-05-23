package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 22:41
 * @Description:
 */
public class RegExp9 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
        // 默认是贪婪匹配
        // String regStr = "\\d+";
        // 非贪婪匹配(限定符后面加?就是非贪婪匹配)
        String regStr = "\\d+?";

        Matcher matcher = Pattern.compile(regStr).matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
