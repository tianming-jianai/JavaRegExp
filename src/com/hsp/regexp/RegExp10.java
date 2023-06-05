package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/4 14:41
 * @Description:
 */
public class RegExp10 {

    public static void main(String[] args) {
        // 汉字
        String regStr = "^[\u0391-\uff35]+$";
        String content = "韩顺平教育";
        // 1-9开头的6位数
        regStr = "^[1-9]\\d{5}$";
        content = "122222";
        // qq号码：1-9开头，5位-10位数
        regStr = "^[1-9]\\d{5,9}";
        content = "12389";
        // 手机号码
        regStr = "^1[3|4|5|8]\\d{9}$";
        content = "13389280892";
        Matcher matcher = Pattern.compile(regStr).matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }

    }
}
