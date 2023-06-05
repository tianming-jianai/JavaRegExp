package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 20:37
 * @Description:
 */
public class RegExp12 {

    public static void main(String[] args) {
        String content = "hello jack1441 tom11111 jack22 yyy xxx";
        // String regStr = "(\\d)\\1";// 两个连续相同的数字
        // String regStr = "(\\d)\\1{4}";// 五个连续相同的数字
        String regStr = "(\\d)(\\d)\\2\\1";// 千、个位相同，百、十位相同
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }
}
