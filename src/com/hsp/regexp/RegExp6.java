package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/5/23 22:07
 * @Description:
 */
public class RegExp6 {
    public static void main(String[] args) {
        // String content = "123-abc";
        // 以至少1个数字开头，后接任意个小写字母的字符串
        // String regStr = "^[0-9]+[a-z]*";
        // 以至少1个数字开头，以至少1个小写字母结束
        // String regStr = "^[0-9]+\\-[a-z]*$";


        // 表示匹配边界的han
        String content = "hanshunping shan nnhan abcdhan; mmmhan.";
        String regStr = "han\\b";
        Matcher matcher = Pattern.compile(regStr).matcher(content);
        while (matcher.find()) {
            System.out.println("找到：" + matcher.group(0));
        }
    }
}
