package com.hsp.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @BelongsProject: javaRegex
 * @BelongsPackage: com.hsp.regexp
 * @author: 张世罡
 * @CreateTime: 2023/6/5 22:06
 * @Description:
 */
public class Homework03 {

    public static void main(String[] args) {
        // 对一个url进行解析
        // 协议、域名、端口、文件名
        String content = "https://www.sohu.com:8080/abc/index.htm";

        String regStr = "^(http|https)://([\\w+.]+):(\\d+)[\\w-/]*/([\\w+.]+)$";
        Matcher matcher = Pattern.compile(regStr).matcher(content);
        if (matcher.matches()) {
            System.out.println("协议:" + matcher.group(1));
            System.out.println("域名:" + matcher.group(2));
            System.out.println("端口:" + matcher.group(3));
            System.out.println("文件名:" + matcher.group(4));
        } else {
            System.out.println("匹配失败");
        }
    }
}
